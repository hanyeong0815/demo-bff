package com.example.bff.member.service;

import com.example.bff.application.usecase.FindMemberUseCase;
import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import com.example.grpc.member.lib.*;
import com.example.grpc.member.lib.MemberFindGrpc.MemberFindImplBase;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberFindService extends MemberFindImplBase {
    private final FindMemberUseCase findMemberUseCase;

    @Override
    public void memberFindById(MemberFindByIdRequest request, StreamObserver<MemberFindByIdResponse> responseObserver) {
        MemberDetailViewResponseDto responseDto =
                findMemberUseCase.findById(UUID.fromString(request.getId()));
        MemberFindByIdResponse response = MemberFindByIdResponse.newBuilder()
                .setId(responseDto.id().toString())
                .setUsername(responseDto.username())
                .setNickname(responseDto.nickname())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void memberFindAll(MemberFindAllRequest request, StreamObserver<MemberFindAllResponse> responseObserver) {
        Pageable pageable = PageRequest.of(request.getPage(), 5);
        pageable = pageable.previousOrFirst();
        MemberListViewResponseDto responseDto =
                findMemberUseCase.findAll(pageable);
        MemberFindAllResponse response =
                MemberFindAllResponse.newBuilder()
                        .addAllMembers(responseDto.members().stream().map(member ->
                                MemberFindByIdResponse.newBuilder()
                                        .setId(member.id().toString())
                                        .setUsername(member.username())
                                        .setNickname(member.nickname())
                                        .build()).toList())
                        .setAllContent(responseDto.AllContent())
                        .setLastPage(responseDto.lastPage())
                        .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
