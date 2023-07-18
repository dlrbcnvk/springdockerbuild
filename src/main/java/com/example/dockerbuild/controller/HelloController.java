package com.example.dockerbuild.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        log.info("GET /hello called");

        // 서버 ip, hostname
        InetAddress addr = InetAddress.getLocalHost();
        String strIP = addr.getHostAddress();
        String hostName = addr.getHostName();

        StringBuilder sb = new StringBuilder();
        sb.append("hello spring docker cicd 🤔");
        sb.append("<br><br>");
        sb.append("server IP: ");
        sb.append(strIP);
        sb.append("<br><br>");
        sb.append("hostname: ");
        sb.append(hostName);

        return sb.toString();
    }
}
