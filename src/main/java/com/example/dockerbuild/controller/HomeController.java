package com.example.dockerbuild.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@Slf4j
public class HomeController {

    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping("/")
    public String home() throws UnknownHostException {
        log.info("GET / called");

        // 서버 ip, hostname
        InetAddress addr = InetAddress.getLocalHost();
        String strIP = addr.getHostAddress();
        String hostName = addr.getHostName();

        StringBuilder sb = new StringBuilder();
        sb.append("home page");
        sb.append("<br><br>");
        sb.append("server IP: ");
        sb.append(strIP);
        sb.append("<br><br>");
        sb.append("hostname: ");
        sb.append(hostName);

        return sb.toString();
    }
}
