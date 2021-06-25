package com.artservice.config;

import com.timgroup.statsd.NonBlockingStatsDClientBuilder;
import com.timgroup.statsd.StatsDClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@Configuration
@AllArgsConstructor
public class DataDog {

    @Value("${management.metrics.export.statsd.host}")
    private final String statsdHost;

    @Value("${management.metrics.export.statsd.port}")
    private final int statsdPort;

    @Bean
    public StatsDClient statsDClient() {
        return new NonBlockingStatsDClientBuilder()
                .prefix("art.service")
                .hostname(statsdHost)
                .port(statsdPort)
                .build();
    }

}
