package com.artservice.service.util;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import static org.mockito.Mockito.when;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 30/06/2021
 */
//TODO - to complete
@Tags(value = {
        @Tag("..."),
        @Tag("...")
})
class EmailServiceTest extends AbstractTest {

    private static final String RECIPIENT = "test@gmail.com";

    @MockBean
    private JavaMailSender javaMailSender;

    @ResourceLock(value = RECIPIENT, mode = ResourceAccessMode.READ)
    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("...")
    void testSendEmail() {
        when(javaMailSender.createMimeMessage()).thenReturn(new MimeMessage((Session) null));

    }

}