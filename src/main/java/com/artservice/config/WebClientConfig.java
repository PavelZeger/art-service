package com.artservice.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.client.WebClient;
//
///**
// * @author Pavel Zeger
// * @implNote art-service
// * @since 10/07/2021
// */
//@Configuration
//public class WebClientConfig {
//
//    @Value("${artsy.base.url}")
//    private String baseUrl;
//
//    @Bean
//    public WebClient webClient() {
//        return WebClient.builder()
//                .baseUrl(baseUrl)
//                .build();
//    }
//
//}
