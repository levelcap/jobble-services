package com.jobble.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@ComponentScan("com.jobble.services")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}