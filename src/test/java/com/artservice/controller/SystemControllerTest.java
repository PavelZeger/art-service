package com.artservice.controller;

import com.artservice.AbstractTest;
import com.artservice.service.util.VersionService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@Tag("systemController")
@Execution(ExecutionMode.CONCURRENT)
@RunWith(SpringRunner.class)
@WebFluxTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureWebTestClient
class SystemControllerTest {

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