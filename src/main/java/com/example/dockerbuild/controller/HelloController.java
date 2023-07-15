package com.example.dockerbuild.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    // 왜 ec2 에 자동배포가 안 되지
    @GetMapping("/hello")
    public String hello() {
        log.info("GET /hello called");
        return "hello spring docker cicd 🤔";
    }
}
