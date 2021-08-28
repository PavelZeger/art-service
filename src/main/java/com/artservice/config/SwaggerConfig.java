package com.artservice.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 02/07/2021
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(getInfo())
                .externalDocs(getExternalDocumentation());
    }

    private Info getInfo() {
        return new Info()
                .title("Art Service API")
                .description("Art Service API for Artsy Public API")
                .version("1.0.0")
                .license(getLicense())
                .contact(getContact());
    }

    private License getLicense() {
        return new License()
                .name("Apache 2.0")
                .url("http://springdoc.org");
    }

    private ExternalDocumentation getExternalDocumentation() {
        return new ExternalDocumentation()
                .description("Artsy Public API documentation")
                .url("https://developers.artsy.net/v2/");
    }

    private Contact getContact() {
        return new Contact()
                .name("Art Service")
                .email("art.service@gmail.com");
    }

}
