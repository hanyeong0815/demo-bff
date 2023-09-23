package com.example.bff.nosql.repository;

import com.example.bff.application.repository.BoardRepository;
import com.example.bff.domain.Board;
import com.example.bff.nosql.entity.BoardEntity;
import com.example.bff.nosql.mapper.BoardEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardPersistence implements BoardRepository {
    private final BoardEntityMapper mapper;
    private final BoardMongoRepository boardMongoRepository;

    @Override
    public Board save(Board board) {
        BoardEntity boardEntity = mapper.toEntity(board);
        BoardEntity savedEntity = boardMongoRepository.save(boardEntity);
        return mapper.toDomain(savedEntity);
    }
}
