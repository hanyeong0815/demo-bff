package com.example.bff.web.board.service;

import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.bff.web.common.support.TimeMapper;
import com.example.grpc.board.lib.BoardSaveGrpc.BoardSaveBlockingStub;
import com.example.grpc.board.lib.BoardSaveRequest;
import com.example.grpc.board.lib.BoardSaveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GrpcBoardClient implements BoardClient {
    private final BoardSaveBlockingStub boardSaveBlockingStub;
    private final TimeMapper timeMapper;
    @Override
    public BoardSaveResponseDto save(BoardSaveRequestDto requestDto) {
        BoardSaveResponse response = boardSaveBlockingStub
                .boardSave(
                        BoardSaveRequest.newBuilder()
                                .setTitle(requestDto.title())
                                .setContent(requestDto.content())
                                .setUploadDatetime(
                                        timeMapper.toTimestamp(requestDto.uploadDatetime())
                                )
                                .build()
                );
        return toBoardSaveResponseDto(response);
    }

    private BoardSaveResponseDto toBoardSaveResponseDto(BoardSaveResponse res) {
        return BoardSaveResponseDto.builder()
                .id(res.getId())
                .title(res.getTitle())
                .content(res.getContent())
                .uploadDatetime(timeMapper.toInstant(res.getUploadDatetime()))
                .build();
    }
}
