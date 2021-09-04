package com.artservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAsync
//@EnableScheduling
//@EnableCaching
@EnableAdminServer
public class ArtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtServiceApplication.class, args);
    }

}
