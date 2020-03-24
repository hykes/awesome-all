package com.github.hykes.demo.graphql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:27:00
 */
@RestController
@RequestMapping("api/date")
public class DateController {

    @GetMapping
    public Date date() {
        return new Date();
    }
}
