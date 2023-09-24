package com.example.bff.web.board.handler;

import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.bff.web.board.service.BoardClient;
import com.example.bff.web.common.support.BaseBffCrudWebFluxHandler;
import com.example.utils.time.ServerTime;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class BoardHandlerV1 implements BaseBffCrudWebFluxHandler {
    private final BoardClient boardClient;
    private final ServerTime serverTime;

    @Override
    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<BoardSaveResponseDto> responseDtoMono =
                request.bodyToMono(BoardSaveRequestDto.class)
                        .map(requestDto -> {
                            BoardSaveRequestDto req = BoardSaveRequestDto.builder()
                                    .title(requestDto.title())
                                    .content(requestDto.content())
                                    .uploadDatetime(serverTime.nowInstant())
                                    .build();
                            return boardClient.save(req);
                        });

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(responseDtoMono, BoardSaveRequestDto.class);
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
