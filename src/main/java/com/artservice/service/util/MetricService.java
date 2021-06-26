package com.artservice.service.util;

import com.timgroup.statsd.StatsDClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 26/06/2021
 */
@Service
public class MetricService {

    @Autowired
    private StatsDClient statsDClient;

    public void gauge(Metric metric, long value) {
        statsDClient.gauge(metric.name(), value);
    }

    public void gauge(Metric metric, double value) {
        statsDClient.gauge(metric.name(), value);
    }

    public void count(Metric metric, int delta) {
        statsDClient.count(metric.name(), delta);
    }

    public void incrementCounter(Metric metric) {
        statsDClient.incrementCounter(metric.name());
    }

    public void incrementCounter(String metricName, String tags) {
        statsDClient.incrementCounter(metricName, tags);
    }

    public void reportDurationMillis(Metric metric, Instant start) {
        final var duration = Duration.between(start, Instant.now());
        gauge(metric, duration.toMillis());
    }

}
