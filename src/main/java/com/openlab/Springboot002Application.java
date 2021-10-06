package com.openlab;

import com.openlab.pojo.User;
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
    public void  addUser(User user)
    {
        System.out.println("小明添加user~~~");
    }
}
