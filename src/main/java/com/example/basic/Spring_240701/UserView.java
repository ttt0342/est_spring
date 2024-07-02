package com.example.basic.Spring_240701;

import java.util.Scanner;

public class UserView {
    public void printUserDetails(User user) { // 유저를 받아서 네임과 이메일을 출력한다.
        System.out.println("User details: ");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
    // 뷰가 하는 일 = 화면에 출력하는 것만 담당
    // 출력 기능을 통해 화면에 보여주는 역할
    // MVC 패턴에서 뷰만 프론트엔드에서 가져가서 수행한다.

    public void inputUserDetails(User user) {
        Scanner scanner = new Scanner(System.in);
        // 입력도 받을 수 있다. = 입출력은 뷰가 담당한다.

        scanner.close();
    }

}
