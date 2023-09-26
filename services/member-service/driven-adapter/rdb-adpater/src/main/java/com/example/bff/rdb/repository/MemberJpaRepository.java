package com.example.bff.rdb.repository;

import com.example.bff.rdb.entity.MemberEntity;
import com.example.bff.rdb.projection.MemberViewProjection.MemberDetailViewResponseProjection;
import com.example.bff.rdb.projection.MemberViewProjection.MemberListViewResponseProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, UUID> {
    boolean existsByUsername(String username);

    Optional<MemberDetailViewResponseProjection> findProjectionById(UUID id);

    Page<MemberDetailViewResponseProjection> findProjectionBy(Pageable pageable);

    Optional<MemberEntity> findByUsername(String username);
}
