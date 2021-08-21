package com.artservice.service;

import com.artservice.model.response.system.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Instant;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 21/08/2021
 */
@Slf4j
@Service
public class ArtService {

    @Value("${artsy.base.url}")
    private String baseUrl;

    @Value("${artsy.timeout}")
    private int timeout;

    @Autowired
    private WebClient webClient;

    public Mono<Status> getStatus() {
        Instant startTime = Instant.now();
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path(baseUrl + "status")
                        .build())
                .retrieve()
                .bodyToMono()
                .doOnSuccess()
                .checkpoint()
                .doOnError(throwable -> throwable)
                .checkpoint()
                .onErrorResume()
                .checkpoint()
                .metrics()
                .switchIfEmpty();
    }

    private void logError() {

    }

    private void logSuccess() {

    }

}
