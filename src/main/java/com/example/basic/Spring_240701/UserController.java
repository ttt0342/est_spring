package com.example.basic.Spring_240701;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserController {
    // 핸들링 할 수 있는 컨트롤러로 메인 메서드에서 연동시켜 화면에 출력한다.
    private User model;
    private UserView view;

    public void updateView() {
        view.printUserDetails(model);
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public void setUserAge(int age) {
        model.setAge(age);
    }

}
