package com.example.bff.board.service;

import com.example.bff.application.usecase.SaveBoardUseCase;
import com.example.bff.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardSaveProxyService {
    private final SaveBoardUseCase saveBoardUseCase;
    public Board saveBoard(Board board) {
        return saveBoardUseCase.saveBoard(board);
    }
}
