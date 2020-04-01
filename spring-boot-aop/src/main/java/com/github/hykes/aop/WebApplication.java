package com.github.hykes.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:17:00
 */

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        new SpringApplication(WebApplication.class).run(args);
    }
    
}