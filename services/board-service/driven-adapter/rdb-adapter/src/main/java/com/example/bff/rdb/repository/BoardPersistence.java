package com.example.
        bff.rdb.repository;

import com.example.bff.domain.Board;
import com.example.bff.rdb.entity.BoardEntity;
import com.example.bff.rdb.mapper.BoardEntityMapper;
import com.example.bff.application.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardPersistence implements BoardRepository {
    private final BoardEntityMapper mapper;
    private final BoardJpaRepository boardJpaRepository;

    @Override
    public Board save(Board board) {
        BoardEntity boardEntity = mapper.toEntity(board);
        BoardEntity savedEntity = boardJpaRepository.save(boardEntity);
        return mapper.toDomain(savedEntity);
    }
}
