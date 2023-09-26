package com.example.bff.application.usecase;

import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface FindMemberUseCase {
    MemberDetailViewResponseDto findById(UUID id);
    MemberListViewResponseDto findAll(Pageable pageable);
}
