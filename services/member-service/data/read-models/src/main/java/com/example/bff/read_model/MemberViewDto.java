package com.example.bff.read_model;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

public record MemberViewDto() {
    @Builder
    public record MemberDetailViewResponseDto(
            UUID id,
            String username,
            String nickname
    ) {}

    @Builder
    public record MemberListViewResponseDto(
            List<MemberDetailViewResponseDto> members,
            Long AllContent,
            Integer lastPage
    ) {}
}
