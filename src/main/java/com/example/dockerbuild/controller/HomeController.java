package com.example.dockerbuild.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping("/")
    public String home() {
        log.info("GET / called");
        return "home";
    }
}
