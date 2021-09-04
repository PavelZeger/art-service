package com.artservice.service;

import com.artservice.model.response.system.ApiStatus;
import com.artservice.model.response.system.Status;
import com.artservice.service.util.Metric;
import com.artservice.service.util.MetricService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeoutException;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 21/08/2021
 */
@Slf4j
@Service
public class ArtService {

    @Value("${artsy.base.url}")
    private String baseUrl;

    @Value("${artsy.timeout}")
    private int timeout;

    @Autowired
    private MetricService metricService;

//    public Mono<Status> getStatus() {
//        Instant startTime = Instant.now();
//        return webClient
//                .get()
//                .uri(uriBuilder -> uriBuilder
//                        .path(baseUrl + "status")
//                        .build())
//                .retrieve()
//                .bodyToMono(Status.class)
//                .doOnSuccess(response -> logSuccess(startTime, response))
//                .checkpoint("Class: ".concat(ArtService.class.getName()).concat(", method: getStatus, step: doOnSuccess"))
//                .doOnError(this::logError)
//                .onErrorResume()
//                .metrics()
//                .switchIfEmpty(Mono.just(getDefaultStatus()))
//                .checkpoint("Class: ".concat(ArtService.class.getName()).concat(", method: getStatus, step: switchIfEmpty"));
//    }

    private void logError(Throwable exception) {
        if (exception instanceof TimeoutException) {
            log.error("");
            metricService.incrementCounter(Metric.STATUS_REQUEST_ERROR);
        }

        log.error("");
        metricService.incrementCounter(Metric.STATUS_REQUEST_ERROR);
    }

    private void logSuccess(Instant startTime, Status response) {
        log.debug("");
        metricService.incrementCounter(Metric.STATUS_REQUEST_COUNT);
        metricService.reportDurationMillis(Metric.STATUS_REQUEST_DURATION, startTime);
    }

    private Status getDefaultStatus() {
        String apiStatus = ApiStatus.MAJOR.getStatus();
        DateTimeFormatter dateTimePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        LocalDateTime modifiedDateTime = LocalDateTime.parse(LocalDateTime.now().toString(), dateTimePattern);
        return new Status(apiStatus, modifiedDateTime);
    }

}
