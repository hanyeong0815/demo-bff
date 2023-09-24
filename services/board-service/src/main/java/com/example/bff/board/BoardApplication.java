package com.example.bff.board;

import com.example.bff.rdb.entity.BoardEntity;
import com.example.bff.rdb.repository.BoardJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@ConfigurationPropertiesScan(basePackages = "com.example")
@EnableJpaRepositories(basePackageClasses = BoardJpaRepository.class)
@EntityScan(basePackageClasses = BoardEntity.class)
public class BoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }
}
