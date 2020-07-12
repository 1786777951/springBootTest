package com.zjf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public static String main(String[] args) {
        return "Hello SpringBoot!";
    }
}
