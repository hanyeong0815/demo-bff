package com.example.bff.web.member.service;

import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveRequestDto;
import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveResponseDto;

public interface MemberClient {
    MemberSaveResponseDto save(MemberSaveRequestDto requestDto);
}
