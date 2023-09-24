package com.example.bff.domain.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MemberType {
    M("M"),
    F("F");

    public final String genderType;
}
