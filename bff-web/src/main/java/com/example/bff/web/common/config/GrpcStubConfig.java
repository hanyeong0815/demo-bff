package com.example.bff.web.common.config;

import com.example.grpc.board.lib.BoardSaveGrpc;
import com.example.grpc.board.lib.BoardSaveGrpc.BoardSaveBlockingStub;
import com.example.grpc.member.lib.MemberSaveGrpc;
import com.example.grpc.member.lib.MemberSaveGrpc.MemberSaveBlockingStub;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcStubConfig {
    @Bean
    public MemberSaveBlockingStub memberSaveBlockingStub() {
        return MemberSaveGrpc.newBlockingStub(
                ManagedChannelBuilder
                        .forAddress("localhost", 8081)
                        .usePlaintext()
                        .build()
        );
    }

    @Bean
    public BoardSaveBlockingStub boardSaveBlockingStub() {
        return BoardSaveGrpc.newBlockingStub(
                ManagedChannelBuilder
                        .forAddress("localhost", 8091)
                        .usePlaintext()
                        .build()
        );
    }
}
