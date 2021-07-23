package com.artservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.mediatype.hal.HalLinkDiscoverer;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 23/07/2021
 */
@Configuration
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class HateoasConfig {

    @Bean
    public LinkDiscoverer linkDiscoverer() {
        return new HalLinkDiscoverer();
    }

}
