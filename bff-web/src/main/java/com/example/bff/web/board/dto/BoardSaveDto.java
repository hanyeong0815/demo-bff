package com.example.bff.web.board.dto;

import lombok.Builder;

import java.time.Instant;

public record BoardSaveDto() {
    @Builder
    public record BoardSaveRequestDto(
            String title,
            String content,
            Instant uploadDatetime
    ) {}

    @Builder
    public record BoardSaveResponseDto(
            Long id,
            String title,
            String content,
            Instant uploadDatetime
    ) {}
}
