package com.example.bff.rdb.mapper;

import com.example.bff.domain.Member;
import com.example.bff.rdb.entity.MemberEntity;
import com.example.support.mapper.DomainEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface MemberEntityMapper extends DomainEntityMapper<Member, MemberEntity> {
}
