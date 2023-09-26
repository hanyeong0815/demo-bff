package com.example.bff.rdb.projection;

import java.util.UUID;

public record MemberViewProjection() {
    public record MemberDetailViewResponseProjection(
            UUID id,
            String username,
            String nickname
    ) {}

    public record MemberListViewResponseProjection(
            UUID id,
            String username,
            String nickname
    ) {}
}
