package com.github.hykes.demo.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:17:00
 */

@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        new SpringApplication(GraphqlApplication.class).run(args);
    }
    
}