package com.example.bff.board.service;

import com.example.bff.application.usecase.SaveBoardUseCase;
import com.example.bff.domain.Board;
import com.example.grpc.board.lib.BoardSaveGrpc.BoardSaveImplBase;
import com.example.grpc.board.lib.BoardSaveRequest;
import com.example.grpc.board.lib.BoardSaveResponse;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.Instant;

@GrpcService
@RequiredArgsConstructor
public class BoardServerService extends BoardSaveImplBase {
    private final SaveBoardUseCase saveBoardUseCase;
    @Override
    public void boardSave(BoardSaveRequest request, StreamObserver<BoardSaveResponse> responseObserver) {
        Board board = Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .uploadDatetime(Instant.ofEpochSecond(request.getUploadDatetime().getSeconds(), request.getUploadDatetime().getNanos()))
                .build();
        Board savedBoard = saveBoardUseCase.saveBoard(board);
        BoardSaveResponse response = BoardSaveResponse.newBuilder()
                .setId(savedBoard.id)
                .setTitle(savedBoard.title)
                .setContent(savedBoard.content)
                .setUploadDatetime(
                        com.google.protobuf.Timestamp.newBuilder()
                                .setSeconds(savedBoard.uploadDatetime.getEpochSecond())
                                .setNanos(savedBoard.uploadDatetime.getNano())
                )
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
