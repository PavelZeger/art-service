package com.artservice.controller;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@ExtendWith(SpringExtension.class)
@AutoConfigureWebTestClient
class SystemControllerTest extends AbstractTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    @DisplayName("System controller should return OK for /status endpoint")
    void testStatus() {
        webTestClient
                .get()
                .uri("/status")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("OK");
    }

}