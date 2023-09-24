package com.example.bff.web.member.service;

import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveRequestDto;
import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveResponseDto;
import com.example.grpc.member.lib.MemberSaveGrpc;
import com.example.grpc.member.lib.MemberSaveGrpc.MemberSaveBlockingStub;
import com.example.grpc.member.lib.MemberSaveRequest;
import com.example.grpc.member.lib.MemberSaveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GrpcMemberClient implements MemberClient {
    private final MemberSaveBlockingStub memberSaveBlockingStub;

    @Override
    public MemberSaveResponseDto save(MemberSaveRequestDto requestDto) {
        MemberSaveResponse response = memberSaveBlockingStub
                .memberSave(
                        MemberSaveRequest.newBuilder()
                                .setUsername(requestDto.username())
                                .setPassword(requestDto.password())
                                .setGenderType(requestDto.genderType())
                                .setNickname(requestDto.nickname())
                                .build()
                );
        return toMemberResponseDto(response);
    }

    private MemberSaveResponseDto toMemberResponseDto(MemberSaveResponse res) {
        return MemberSaveResponseDto.builder()
                .id(res.getId())
                .username(res.getUsername())
                .genderType(res.getGenderType())
                .nickname(res.getNickname())
                .build();
    }
}
