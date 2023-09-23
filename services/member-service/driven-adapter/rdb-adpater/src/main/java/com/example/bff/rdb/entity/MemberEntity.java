package com.example.bff.rdb.entity;

import com.example.bff.domain.type.MemberType;
import com.example.bff.jpa.UuidBaseEntity;
import com.example.bff.rdb.support.MemberSchemaConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Table(
        schema = MemberSchemaConstants.SCHEMA,
        name = MemberSchemaConstants.TABLE
)
public class MemberEntity extends UuidBaseEntity {
    public String username;
    public String password;
    @Enumerated(EnumType.STRING)
    public MemberType genderType;
    public String nickname;
}
