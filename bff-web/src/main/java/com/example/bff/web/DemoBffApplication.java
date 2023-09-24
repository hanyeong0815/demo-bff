package com.example.bff.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import static com.example.support.ServerConstants.BASE_PACKAGE;

@SpringBootApplication(scanBasePackages = BASE_PACKAGE)
@ConfigurationPropertiesScan(basePackages = BASE_PACKAGE)
public class DemoBffApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoBffApplication.class, args);
    }
}
