package com.example.basic.Spring_240717;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.basic.Spring_240717")
public class BasicApplication {
    // 해당하는 대상이 아니라면 빈이더라도 IoC에 올라가지 않는다.
    // = 한정자 (scanBasePackages)

//    @Autowired
//    @Qualifier("sendMessage")
//    Message message;

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void printConfig() {
        // TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul")); //포스트 컨스트럭터 사용법
        // 세팅을 미리 해두어야 할 때 가장 사용 효율이 좋다.
        System.out.println("포트번호: " + port);
        System.out.println("애플리케이션 이름: " + appName);
    }
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}  //초기화가 되고 난 후 실행되는 것
