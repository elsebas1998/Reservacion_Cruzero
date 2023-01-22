package com.example.springboot2mongo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
@Slf4j
@EnableMongoAuditing
@SpringBootApplication
public class SpringBoot2MongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2MongoApplication.class, args);
    }

}
