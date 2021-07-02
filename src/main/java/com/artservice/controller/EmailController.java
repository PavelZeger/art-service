package com.artservice.controller;

import com.artservice.controller.dto.Email;
import com.artservice.service.util.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
//TODO - to complete
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
        return emailRequest;
    }

}
