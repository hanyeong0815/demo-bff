package com.example.bff.rdb.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static com.example.support.ServerConstants.BASE_PACKAGE;

@Configuration
@EnableJpaRepositories(basePackages = BASE_PACKAGE)
@EntityScan(basePackages = BASE_PACKAGE)
public class JpaConfig {
}
