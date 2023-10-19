package com.example.bff.domain;

import com.example.bff.domain.type.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    public UUID id;
    public String username;
    public String password;
    public GenderType genderType;
    public String nickname;
}
