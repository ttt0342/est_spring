package com.example.basic.Spring_240715;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String email;
    private boolean admin;
    // 유저가 어드민인지 판별함
    private boolean person;
    private String name;

}