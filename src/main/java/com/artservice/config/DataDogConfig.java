package com.artservice.config;

import com.timgroup.statsd.NonBlockingStatsDClientBuilder;
import com.timgroup.statsd.StatsDClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@Configuration
public class DataDogConfig {

    @Value("${datadog.statsd.host}")
    private String statsdHost;

    @Value("${datadog.statsd.port}")
    private int statsdPort;

    @Bean
    public StatsDClient statsDClient() {
        return new NonBlockingStatsDClientBuilder()
                .prefix("art.service")
                .hostname(statsdHost)
                .port(statsdPort)
                .build();
    }

}
