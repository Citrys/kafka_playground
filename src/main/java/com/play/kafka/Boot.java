package com.play.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }

}