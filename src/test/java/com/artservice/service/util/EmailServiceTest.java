package com.artservice.service.util;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
class EmailServiceTest extends AbstractTest {

    @MockBean
    private JavaMailSender javaMailSender;

    @Test
    @DisplayName("")
    void sendEmail() {
        when(javaMailSender.createMimeMessage()).thenReturn(new MimeMessage((Session) null));

    }

}