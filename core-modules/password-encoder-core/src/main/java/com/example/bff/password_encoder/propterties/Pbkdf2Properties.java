package com.example.bff.password_encoder.propterties;

import com.example.bff.password_encoder.type.Pbkdf2AlgorithmWithHmacOf;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationPropertiesBinding
public record Pbkdf2Properties(
        String secret,
        Integer costFactor,
        Integer saltLength,
        Pbkdf2AlgorithmWithHmacOf algorithm
) {
    public Pbkdf2Properties {
        if (secret == null) secret = "abc123abc123abc123abc123abc123abc123";
        if (costFactor == null) costFactor = 12;
        if (saltLength == null) saltLength = 64;
        if (algorithm == null) algorithm = Pbkdf2AlgorithmWithHmacOf.SHA256;
    }
}