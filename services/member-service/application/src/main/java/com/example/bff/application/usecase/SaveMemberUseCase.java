package com.example.bff.application.usecase;

import com.example.bff.domain.Member;

public interface SaveMemberUseCase {
    Member save(Member member);
}
