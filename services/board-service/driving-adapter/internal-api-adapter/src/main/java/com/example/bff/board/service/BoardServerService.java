package com.example.bff.board.service;

import com.example.bff.domain.Board;
import com.example.grpc.board.lib.BoardSaveGrpc.BoardSaveImplBase;
import com.example.grpc.board.lib.BoardSaveRequest;
import com.example.grpc.board.lib.BoardSaveResponse;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.Instant;

@GrpcService
@RequiredArgsConstructor
public class BoardServerService extends BoardSaveImplBase {
    private final BoardSaveProxyService boardSaveProxyService;
    @Override
    public void boardSave(BoardSaveRequest request, StreamObserver<BoardSaveResponse> responseObserver) {
        Board board = Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .uploadDatetime(Instant.ofEpochSecond(request.getUploadDatetime().getSeconds(), request.getUploadDatetime().getNanos()))
                .build();
        boardSaveProxyService.saveBoard(board);
    }
}
