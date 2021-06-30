package com.artservice.service.util;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import java.util.List;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 30/06/2021
 */
@Service
@RequiredArgsConstructor
public class EmailService {

    @Value("${spring.mail.sender.address}")
    private final String senderAddress;

    @Autowired
    private JavaMailSender javaMailSender;

    @SneakyThrows
    public void sendEmail(List<Address> recipients, String subject, String messageText) {
        var mimeMessage = javaMailSender.createMimeMessage();
        mimeMessage.setSender(new InternetAddress(senderAddress));
        mimeMessage.setFrom();
        mimeMessage.setRecipients(Message.RecipientType.TO, recipients.toArray(Address[]::new));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(messageText);

        javaMailSender.send(mimeMessage);
    }

}
