package com.example.bff.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    public Long id;
    public String title;
    public String content;
    public Instant uploadDatetime;
}
