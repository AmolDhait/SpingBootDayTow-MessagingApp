package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class HelloWorldApplication {


    public static void main(String[] args) {

        System.out.println("Hello, This My Spring boot project");
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
