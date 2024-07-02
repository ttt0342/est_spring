package com.example.basic.Spring_240701;

import org.apache.catalina.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //Bean, 컴포넌트도 빈으로 올라간다.
public class Car {
    private Engine engine;

//    public Car() {
//        this.engine = new Engine(); //DIP 의존역전의 원칙
//        // 엔진클래스에 의존하고 있다. = 강결합
//
//    }
    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }
}
