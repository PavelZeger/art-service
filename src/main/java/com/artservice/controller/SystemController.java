package com.artservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@RestController
public class SystemController {

    @GetMapping(path = "/status", produces = MediaType.TEXT_PLAIN_VALUE)
    public String status() {
        return "OK";
    }

}
