package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloController {

    // http://localhost:8080/api/Hello
    @GetMapping("/Hello")
    public String Hello(){
        return "Hello Soosai...";
    }


}
