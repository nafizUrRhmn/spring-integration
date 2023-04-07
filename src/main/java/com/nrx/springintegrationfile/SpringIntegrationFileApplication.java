package com.nrx.springintegrationfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
public class SpringIntegrationFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationFileApplication.class, args);
    }

}
