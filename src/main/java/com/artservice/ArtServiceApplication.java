package com.artservice;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEncryptableProperties
@EnableAsync
@EnableAspectJAutoProxy
@EnableScheduling
@EnableCaching
public class ArtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtServiceApplication.class, args);
    }

}
