package com.example.bff.rdb.repository;

import com.example.bff.application.exception.MemberErrorCode;
import com.example.bff.application.repository.MemberRepository;
import com.example.bff.domain.Member;
import com.example.bff.rdb.entity.MemberEntity;
import com.example.bff.rdb.mapper.MemberEntityMapper;
import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class MemberPersistence implements MemberRepository {
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
    public Optional<MemberDetailViewResponseDto> findById(UUID id) {
        return repository
                .findProjectionById(id)
                .map(mapper::from);
    }

    @Override
    public MemberListViewResponseDto findAll(Pageable pageable) {
        Page<MemberDetailViewResponseDto> dto = repository.findProjectionBy(pageable)
                .map(mapper::from);

        return MemberListViewResponseDto.builder()
                .members(dto.getContent())
                .AllContent(dto.getTotalElements())
                .lastPage(dto.getTotalPages())
                .build();
    }

    @Override
    public Optional<Member> findByUsername(String username) {
        return repository.findByUsername(username)
                .map(mapper::toDomain);
    }
}
