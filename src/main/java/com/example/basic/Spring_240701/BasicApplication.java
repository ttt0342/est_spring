package com.example.basic.Spring_240701;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//public class BasicApplication {
//    public static void main(String[] args) {
//        Engine engine = new Engine(); - Car

// 이메일 AOP
//        EmailService emailService = new EmailService(new SmtpEmailSender());
//        EmailService emailService1 = new EmailService(new AwsEmailSender());
//
//        SpringApplication.run(BasicApplication.class, args);

//MVC 패턴
//        User model = new User("aasdf@naver.com", "김성연", 25);
//        UserView userView = new UserView();
//        UserController userController = new UserController(model, userView);
//
//        userController.updateView();
//        userController.setUserName("김승조랑말"); //유저 네임 지정 해주었으나 변경해줌
//        userController.setUserAge(31);
//        System.out.println("=====================");
//        userController.updateView(); // 변경된 유저 이름이 출력된다.
//    }
//}
@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {

        SpringApplication.run(BasicApplication.class, args);
    }

}