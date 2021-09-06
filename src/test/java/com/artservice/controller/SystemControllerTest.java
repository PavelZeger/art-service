package com.artservice.controller;

import com.artservice.service.util.VersionService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.TestInstance.Lifecycle;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@Tag("controller")
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(value = OrderAnnotation.class)
@WebMvcTest(controllers = {SystemController.class})
class SystemControllerTest {

    private static final String VERSION = "1.0";
    private static final String FULL_VERSION = "1.0.0";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    protected VersionService versionService;

    @BeforeAll
    public void setUp() {
        versionService.init();
    }

    @SneakyThrows
    @Test
    @DisplayName("System controller should return OK for /status endpoint")
    void testStatus() {
        mockMvc.perform(get("/status")
                        .accept(MediaType.TEXT_PLAIN)
                        .contentType(MediaType.TEXT_PLAIN))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("OK")));
    }

    @SneakyThrows
    @Test
    @Order(1)
    @DisplayName("System controller should return string for /version endpoint")
    void testVersion() {
        when(versionService.getVersion()).thenReturn(VERSION);
        mockMvc.perform(get("/version")
                        .accept(MediaType.TEXT_PLAIN)
                        .contentType(MediaType.TEXT_PLAIN))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(VERSION)));
    }

    @SneakyThrows
    @Test
    @Order(2)
    @DisplayName("System controller should return string for /version/full endpoint")
    void testFullVersion() {
        when(versionService.getFullVersion()).thenReturn(FULL_VERSION);
        mockMvc.perform(get("/version/full")
                        .accept(MediaType.TEXT_PLAIN)
                        .contentType(MediaType.TEXT_PLAIN))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(FULL_VERSION)));
    }

}