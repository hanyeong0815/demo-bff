package com.example.bff.application.service;

import com.example.bff.application.exception.MemberErrorCode;
import com.example.bff.application.repository.MemberRepository;
import com.example.bff.application.usecase.FindMemberUseCase;
import com.example.bff.application.usecase.SaveMemberUseCase;
import com.example.bff.domain.Member;
import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberService
        implements
        SaveMemberUseCase, FindMemberUseCase {
    private final MemberRepository memberRepository;
    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public MemberDetailViewResponseDto findById(UUID id) {
        return memberRepository
                .findById(id)
                .orElseThrow(
                        MemberErrorCode.NO_SUCH_USER::defaultException
                );
    }

    @Override
    public MemberListViewResponseDto findAll(Pageable pageable) {
        return memberRepository.findAll(pageable);
    }
}
