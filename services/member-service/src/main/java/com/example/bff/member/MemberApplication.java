package com.example.bff.member;

import com.example.bff.rdb.entity.MemberEntity;
import com.example.bff.rdb.repository.MemberJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static com.example.support.ServerConstants.BASE_PACKAGE;

@SpringBootApplication(scanBasePackages = BASE_PACKAGE)
@ConfigurationPropertiesScan(basePackages = BASE_PACKAGE)
@EnableJpaRepositories(basePackageClasses = MemberJpaRepository.class)
@EntityScan(basePackageClasses = MemberEntity.class)
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
