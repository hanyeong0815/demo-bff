package com.example.bff.web.board.router;

import com.example.bff.web.board.handler.BoardHandlerV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
@RequiredArgsConstructor
public class BoardRouter {
    private final BoardHandlerV1 boardHandlerV1;

    @Bean("boardV1")
    RouterFunction<ServerResponse> boardV1() {
        return nest(
                path("/v1/board"),
                route()
                        .POST("", boardHandlerV1::save)
                        .build()
        );
    }
}
