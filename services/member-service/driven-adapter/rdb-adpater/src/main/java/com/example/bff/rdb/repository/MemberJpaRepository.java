package com.example.bff.rdb.repository;

import com.example.bff.rdb.entity.MemberEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, UUID> {
    boolean existsByUsername(String username);

    Page<MemberEntity> findBy(Pageable pageable);

    Optional<MemberEntity> findByUsername(String username);
}
