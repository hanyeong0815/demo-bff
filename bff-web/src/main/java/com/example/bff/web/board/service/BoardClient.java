package com.example.bff.web.board.service;

import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.bff.web.board.dto.BoardSaveDto.BoardSaveResponseDto;

public interface BoardClient {
    BoardSaveResponseDto save(BoardSaveRequestDto requestDto);
}
