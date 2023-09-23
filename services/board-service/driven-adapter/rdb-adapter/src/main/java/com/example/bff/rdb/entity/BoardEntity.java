package com.example.bff.rdb.entity;

import com.example.bff.jpa.BaseEntity;
import com.example.bff.rdb.support.BoardSchemaConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Table(
        schema = BoardSchemaConstants.SCHEMA,
        catalog = BoardSchemaConstants.SCHEMA,
        name = BoardSchemaConstants.TABLE
)
public class BoardEntity extends BaseEntity {
    public String title;
    public String content;
    public Instant uploadDatetime;
}
