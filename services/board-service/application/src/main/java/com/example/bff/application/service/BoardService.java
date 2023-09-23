package com.example.bff.application.service;

import com.example.bff.domain.Board;
import com.example.bff.application.repository.BoardRepository;
import com.example.bff.application.usecase.SaveBoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class BoardService implements SaveBoardUseCase {
    private final BoardRepository boardRepository;
    @Override
    public Board saveBoard(Board board) {
        return boardRepository.save(board);
    }
}
