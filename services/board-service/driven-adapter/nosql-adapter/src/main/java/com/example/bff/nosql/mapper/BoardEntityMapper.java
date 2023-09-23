package com.example.bff.nosql.mapper;

import com.example.bff.domain.Board;
import com.example.bff.nosql.entity.BoardEntity;
import com.example.support.mapper.DomainEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BoardEntityMapper extends DomainEntityMapper<Board, BoardEntity> {
}
