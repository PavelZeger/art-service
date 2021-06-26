package com.artservice.controller;

import com.artservice.service.util.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private VersionService versionService;

    @GetMapping(path = "/status", produces = MediaType.TEXT_PLAIN_VALUE)
    public String status() {
        return "OK";
    }

    @GetMapping(path = "/version", produces = MediaType.TEXT_PLAIN_VALUE)
    public String version() {
        return versionService.getVersion();
    }

    @GetMapping(path = "/version/full", produces = MediaType.TEXT_PLAIN_VALUE)
    public String versionFull() {
        return versionService.getFullVersion();
    }

}
