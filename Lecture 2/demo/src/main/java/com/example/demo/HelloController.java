package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
    @GetMapping("Bye")
    public String getMsg(){
        return  "<h1>Bye Friend</h1>";
    }
}
