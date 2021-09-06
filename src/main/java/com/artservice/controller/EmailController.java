package com.artservice.controller;

import com.artservice.controller.dto.Email;
import com.artservice.service.util.EmailService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
@Slf4j
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping(path = "/email/{recipients}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Email sendEmail(Email emailRequest) {
        emailService.sendEmail(
                emailRequest.getRecipients(),
                emailRequest.getSubject(),
                emailRequest.getMessageText());
        log.debug("The email request: {}", emailRequest);
        return emailRequest;
    }

}
