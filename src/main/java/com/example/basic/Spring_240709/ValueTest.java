package com.example.basic.Spring_240709;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   //테스트에서 바로 작성하여 확인함
public class ValueTest {
    @Value("&{server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    public void print() {
        System.out.println("serverPort: " + serverPort);
        System.out.println("applicationName: " + applicationName);
    }
}
