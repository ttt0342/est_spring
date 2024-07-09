package com.example.basic.Spring_240709;

import org.springframework.stereotype.Component;

@Component //메세지 기반
public class sendMessage implements Message {

    @Override
    public void print() {
        System.out.println("Hello, World!");
    }
}
