package com.kst.codingtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class Controller {

    @GetMapping(value = "/hello-world")
    public String getHelloWorld() {
        return "Hello World";
    }
}
