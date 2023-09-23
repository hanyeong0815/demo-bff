package com.example.bff.nosql.repository;

import com.example.bff.nosql.entity.BoardEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardMongoRepository extends MongoRepository<BoardEntity, String> {
}
