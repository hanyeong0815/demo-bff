package com.example.bff.application.repository;

import com.example.bff.domain.Member;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(UUID id);
    List<Member> findAll(Pageable pageable);
    Optional<Member> findByUsername(String username);
}
