package com.artservice.service.util;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 26/06/2021
 */
@Slf4j
@Getter
@Service
public class VersionService {

    public static final String GIT_PROPERTIES = "git.properties";
    private String version;
    private String fullVersion;

    @SneakyThrows
    @PostConstruct
    public void init() {
        try (var inputStream = new ClassPathResource(GIT_PROPERTIES).getInputStream()) {
            var properties = new Properties();
            properties.load(inputStream);
            version = properties.get("git.tags").toString();
            fullVersion = IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
            log.info("Loaded art service version: ".concat(fullVersion));
        }
    }

}
