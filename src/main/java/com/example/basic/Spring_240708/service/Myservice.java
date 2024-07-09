package com.example.basic.Spring_240708.service;

import com.example.basic.Spring_240708.util.Helper;
import com.example.basic.Spring_240708.util.Test1;
import com.example.basic.Spring_240708.util.Test2;
import com.example.basic.Spring_240708.util.Test3;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor   //생성자 주입 방식  롬복을 통해 코드가 길어지지 않아도 생성자 주입방식 사용할 수 있다.
public class Myservice {
    // @Autowired   필드 주입 방식(의존성) - 의존성 변경이 어렵다.
    // @Qualifier("helperImple") 의존성을 지정해준다.
    private Helper helper;

//    @Autowired
//    public void setHelper(Helper helper) {
//        this.helper = helper;
//    }

//    public String hello() {
//        System.out.println(this.helper);
//        return "Hello, Spring Boot!";
//    }

    // 생성자 주입 방식
    //private final Helper helper;
    private final Test1 test1;
    private final Test2 test2;
    private final Test3 test3;

}
