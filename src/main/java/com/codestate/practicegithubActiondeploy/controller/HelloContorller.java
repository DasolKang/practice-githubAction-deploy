package com.codestate.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {

    @GetMapping("/")
    public String hello() {
        return "Hello World! This is Github Action Deploy Practice!";
    }
}
