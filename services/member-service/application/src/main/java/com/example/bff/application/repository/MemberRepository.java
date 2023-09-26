package com.example.bff.application.repository;

import com.example.bff.domain.Member;
import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository {
    Member save(Member member);
    Optional<MemberDetailViewResponseDto> findById(UUID id);
    MemberListViewResponseDto findAll(Pageable pageable);
    Optional<Member> findByUsername(String username);
}
