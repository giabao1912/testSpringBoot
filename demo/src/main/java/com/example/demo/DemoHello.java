package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHello {
    @RequestMapping("/demo/hello")
    public String hello(){
        return "Hello";
    }
}
