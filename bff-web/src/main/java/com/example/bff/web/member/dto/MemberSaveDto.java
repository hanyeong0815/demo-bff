package com.example.bff.web.member.dto;

import lombok.Builder;

import java.util.UUID;

public record MemberSaveDto() {
    @Builder
    public record MemberSaveRequestDto(
            String username,
            String password,
            String genderType,
            String nickname
    ) {}

    @Builder
    public record MemberSaveResponseDto(
            String id,
            String username,
            String genderType,
            String nickname
    ) {}
}
