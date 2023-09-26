package com.example.bff.rdb.mapper;

import com.example.bff.domain.Member;
import com.example.bff.rdb.entity.MemberEntity;
import com.example.bff.rdb.projection.MemberViewProjection.MemberDetailViewResponseProjection;
import com.example.bff.rdb.projection.MemberViewProjection.MemberListViewResponseProjection;
import com.example.bff.read_model.MemberViewDto.MemberDetailViewResponseDto;
import com.example.bff.read_model.MemberViewDto.MemberListViewResponseDto;
import com.example.support.mapper.DomainEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface MemberEntityMapper extends DomainEntityMapper<Member, MemberEntity> {
    MemberDetailViewResponseDto from(MemberDetailViewResponseProjection memberDetailViewResponseProjection);
    MemberListViewResponseDto from(MemberListViewResponseProjection memberListViewResponseProjection);
}
