package com.example.basic.Spring_240709;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //메세지 기반
@Primary  //우선순위를 getMessage 로 한다.
public class getMessage implements Message {

    @Override
    public void print() {
        System.out.println("Hello, World!2");
    }
}