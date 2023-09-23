package com.example.bff.application.service;

import com.example.bff.application.repository.MemberRepository;
import com.example.bff.application.usecase.SaveMemberUseCase;
import com.example.bff.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements SaveMemberUseCase {
    private final MemberRepository memberRepository;
    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }
}
