package com.example.bff.nosql.entity;

import com.example.bff.nosql.support.BoardSchemaConstants;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(
         collection = BoardSchemaConstants.TABLE
)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    @Id
    public String id;
    @Indexed
    public String title;
    public String content;
    public Instant uploadDatetime;
}
