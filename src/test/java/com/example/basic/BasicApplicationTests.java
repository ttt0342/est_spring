package com.example.basic;

import com.example.basic.Spring_240709.BasicApplication;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void printConfig() {
        System.out.println("포트번호: " + port);
        System.out.println("애플리케이션 이름: " + appName);
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }


}
