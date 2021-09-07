package com.artservice.controller;

//import com.artservice.controller.dto.Email;
//import com.artservice.service.util.EmailService;
//import lombok.SneakyThrows;
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.SpyBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static org.mockito.Mockito.doNothing;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
///**
// * @author Pavel Zeger
// * @implNote art-service
// * @since 01/07/2021
// */
//@Tag("controller")
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@WebMvcTest(controllers = {EmailController.class})
//class EmailControllerTest {
//
//    private static final List<String> RECIPIENTS = List.of("test@gmail.com", "test@outlook.com");
//    private static final String SUBJECT = "Test email";
//    private static final String MESSAGE_TEXT = "Test email for an unit test";
//    private Email email;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @SpyBean
//    private EmailService emailService;
//
//    @BeforeAll
//    void setup() {
//        email = Email.builder()
//                .recipients(RECIPIENTS)
//                .subject(SUBJECT)
//                .messageText(MESSAGE_TEXT)
//                .build();
//    }
//
//    @SneakyThrows
//    @Test
//    @DisplayName("Should return email request")
//    void testSendEmail() {
//        doNothing().when(emailService).sendEmail(RECIPIENTS, SUBJECT, MESSAGE_TEXT);
//        mockMvc.perform(get("/email/{recipients}")
//                        .accept(MediaType.TEXT_PLAIN_VALUE)
//                        .contentType(MediaType.TEXT_PLAIN)
//                        .param("recipients", RECIPIENTS.stream().collect(Collectors.joining(",", "", ""))))
//                .andDo(print())
//                .andExpect(status().isOk());
////                .andExpect(content().)
//    }
//
//}