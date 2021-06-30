package com.artservice.service.util;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import static org.mockito.Mockito.when;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 30/06/2021
 */
//TODO - to complete
@ExtendWith(SpringExtension.class)
class EmailServiceTest extends AbstractTest {

    @MockBean
    private JavaMailSender javaMailSender;

    @Test
    void sendEmail() {
        when(javaMailSender.createMimeMessage()).thenReturn(new MimeMessage((Session) null));

    }

}