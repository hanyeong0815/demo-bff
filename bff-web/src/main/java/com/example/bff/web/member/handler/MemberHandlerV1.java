package com.example.bff.web.member.handler;

import com.example.bff.web.common.support.BaseBffCrudWebFluxHandler;
import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveRequestDto;
import com.example.bff.web.member.dto.MemberSaveDto.MemberSaveResponseDto;
import com.example.bff.web.member.service.MemberClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MemberHandlerV1 implements BaseBffCrudWebFluxHandler {
    private final MemberClient memberClient;

    @Override
    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<MemberSaveResponseDto> dto = request.bodyToMono(MemberSaveRequestDto.class)
                .map(req -> {
                    MemberSaveRequestDto requestDto = MemberSaveRequestDto.builder()
                            .username(req.username())
                            .password(req.password())
                            .genderType(req.genderType())
                            .nickname(req.nickname())
                            .build();
                    return memberClient.save(requestDto);
                });

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(dto, MemberSaveResponseDto.class);
    }

    @Override
    public Mono<ServerResponse> find(ServerRequest request) {
        return null;
    }

    @Override
    public Mono<ServerResponse> findAll(ServerRequest request) {
        return null;
    }

    @Override
    public Mono<ServerResponse> update(ServerRequest request) {
        return null;
    }

    @Override
    public Mono<ServerResponse> delete(ServerRequest request) {
        return null;
    }
}
