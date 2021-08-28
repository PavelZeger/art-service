package com.artservice.service.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 30/06/2021
 */
// TODO to fix - context fails!!!
@Slf4j
//@RequiredArgsConstructor
@Service
public class EmailService {

//    @Value("${spring.mail.sender.address}")
//    private final String senderAddress;
//
//    @Autowired
//    private final JavaMailSender javaMailSender;

//    @SneakyThrows
//    public void sendEmail(List<Address> recipients, String subject, String messageText) {
//        var mimeMessage = javaMailSender.createMimeMessage();
//        mimeMessage.setSender(new InternetAddress(senderAddress));
//        mimeMessage.setFrom();
//        mimeMessage.setRecipients(Message.RecipientType.TO, recipients.toArray(Address[]::new));
//        mimeMessage.setSubject(subject);
//        mimeMessage.setText(messageText);
//        log.info("The email was sent to the following recipients: {}",
//                recipients.stream()
//                        .map(Address::toString)
//                        .collect(Collectors.toUnmodifiableList()));
//        javaMailSender.send(mimeMessage);
//    }

}
