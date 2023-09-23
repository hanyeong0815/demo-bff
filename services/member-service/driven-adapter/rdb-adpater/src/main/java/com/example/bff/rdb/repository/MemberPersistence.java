package com.example.bff.rdb.repository;

import com.example.bff.application.exception.MemberErrorCode;
import com.example.bff.application.repository.MemberRepository;
import com.example.bff.domain.Member;
import com.example.bff.rdb.entity.MemberEntity;
import com.example.bff.rdb.mapper.MemberEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public final class MemberPersistence implements MemberRepository {
    private final MemberEntityMapper mapper;
    private final MemberJpaRepository repository;

    @Override
    public Member save(Member member) {
        boolean hasMember = repository.existsByUsername(member.username);
        if (hasMember) {
            throw MemberErrorCode.USERNAME_ALREADY_USED.defaultException();
        }

        MemberEntity memberEntity = mapper.toEntity(member);
        return mapper.toDomain(repository.save(memberEntity));
    }

    @Override
    public Optional<Member> findById(UUID id) {
        return repository
                .findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public List<Member> findAll(Pageable pageable) {
        return repository.findBy(pageable)
                .map(mapper::toDomain)
                .getContent();
    }

    @Override
    public Optional<Member> findByUsername(String username) {
        return repository.findByUsername(username)
                .map(mapper::toDomain);
    }
}
