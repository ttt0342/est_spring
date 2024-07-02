package com.example.basic.Spring_240701;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @NoArgsConstructor // 파라미터가 없는 생성자
@Getter
@AllArgsConstructor // 의미 : 모든 아규먼트 = 2개
@Setter

public class User { // 단수히 모델, 메서드도 없음
    private String email;
    private String name;
    private int age;

//    public User(String email, String name) { // 어노테이션 사용 시 작성할 필요 없음
//        this.email = email;
//        this.name = name;
//    }

//    public String getEmail() { //게터 -어노테이션 사용 시 필요 없음
//        return email;
//    }
//
//    public String getName() { //게터 -
//        return name;
//    }
}
