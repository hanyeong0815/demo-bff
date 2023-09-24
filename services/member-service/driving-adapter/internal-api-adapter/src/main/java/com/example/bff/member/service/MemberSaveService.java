package com.example.bff.member.service;

import com.example.bff.application.config.PasswordEncoderConfig;
import com.example.bff.application.usecase.SaveMemberUseCase;
import com.example.bff.domain.Member;
import com.example.bff.domain.type.MemberType;
import com.example.grpc.member.lib.MemberSaveGrpc.MemberSaveImplBase;
import com.example.grpc.member.lib.MemberSaveRequest;
import com.example.grpc.member.lib.MemberSaveResponse;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

@GrpcService
@RequiredArgsConstructor
public class MemberSaveService extends MemberSaveImplBase {
    private final SaveMemberUseCase saveMemberUseCase;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void memberSave(MemberSaveRequest request, StreamObserver<MemberSaveResponse> responseObserver) {
        Member member = Member.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .genderType(Objects.equals(request.getGenderType(), "M") ? MemberType.M : MemberType.F)
                .nickname(request.getNickname())
                .build();
        Member savedMember = saveMemberUseCase.save(member);
        MemberSaveResponse memberSaveResponse = MemberSaveResponse.newBuilder()
                .setId(savedMember.id.toString())
                .setUsername(savedMember.username)
                .setGenderType(savedMember.genderType.genderType)
                .setNickname(savedMember.nickname)
                .build();
        responseObserver.onNext(memberSaveResponse);
        responseObserver.onCompleted();
    }
}
