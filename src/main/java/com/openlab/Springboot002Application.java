package com.openlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot002Application {
    System.out.println("修改后的代码第二版本");
    public static void main(String[] args) {
        SpringApplication.run(Springboot002Application.class, args);
    }

}
