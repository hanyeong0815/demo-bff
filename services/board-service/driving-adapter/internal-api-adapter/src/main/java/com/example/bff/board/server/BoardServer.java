package com.example.bff.board.server;

import com.example.bff.board.service.BoardServerService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardServer implements ApplicationRunner {
    private static final int PORT = 8091;
    private final BoardServerService boardServerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Server server = ServerBuilder
                .forPort(PORT)
                .addService(boardServerService)
                .build();
        server.start();
        server.awaitTermination();
    }
}
