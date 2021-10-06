package com.openlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot002Application {

    public static void main(String[] args) {
       System.out.println("aaaaa");
        SpringApplication.run(Springboot002Application.class, args);
    }

}
