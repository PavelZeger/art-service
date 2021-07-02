package com.artservice.controller;

import com.artservice.AbstractTest;
import com.artservice.service.util.VersionService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureWebTestClient
class SystemControllerTest extends AbstractTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    protected VersionService versionService;

    @BeforeAll
    public void setUp() {
        versionService.init();
    }

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

    @Test
    @DisplayName("System controller should return string for /version endpoint")
    void testVersion() {
        webTestClient
                .get()
                .uri("/version")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class);
    }

    @Test
    @DisplayName("System controller should return string for /version/full endpoint")
    void testFullVersion() {
        webTestClient
                .get()
                .uri("/version/full")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class);
    }

}