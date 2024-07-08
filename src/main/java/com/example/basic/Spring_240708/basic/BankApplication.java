package com.example.basic.Spring_240708.basic;

import com.example.basic.Spring_240628.BasicApplication;
import com.example.basic.Spring_240708.service.Myservice;
import com.example.basic.Spring_240708.util.Helper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.basic.Spring_240708")
// 빈을 전부 읽는 것이므로 속도가 느려진다
public class BankApplication {
    public static void main(String[] args) {
        // 세터 주입 방식(의존성)
        Myservice myService = new Myservice();
        myService.hello();
        SpringApplication.run(BasicApplication.class, args);

        SpringApplication.run(BankApplication.class, args);
        // 의존성 부여도 되지 않았으므로 빈을 IoC 컨테이너에 넣어주는 기능이 필요하다.
        // 이 기능을 수행하는 것이 @ComponentScan 이다.
        // => 빈으로 만들어 IoC 컨테이너에 넣어주는 기능을 수행하는 어노테이션
    }
}
