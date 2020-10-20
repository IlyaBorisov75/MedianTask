package com.test.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        Median median = new Median();
        median.pushNum(4);
        median.pushNum(1);
        median.pushNum(7);
        System.out.println(median.getMedian());
    }



}
