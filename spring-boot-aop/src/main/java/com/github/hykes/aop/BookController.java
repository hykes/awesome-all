package com.github.hykes.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-02 09:52:00
 */
@RestController
@RequestMapping("/api/city")
public class BookController {

    @LocalLock(key = "city:arg[0]")
    @GetMapping
    public String query(@RequestParam String token) {
        return "ok- " + token;
    }

    @LocalLock(key = "city:arg[0]")
    @PostMapping
    public String save(@RequestBody BookBody body) {
        return "ok- " + body.getName();
    }

}