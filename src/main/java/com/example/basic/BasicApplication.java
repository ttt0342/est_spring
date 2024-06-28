package com.example.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class BasicApplication {
//
//    @Value("${kakao.api.key}") //Spring Configuration Processor
//    private String name;
//
//    public static void main(String[] args) {
//        UserRepositoryInterface userRepository = new UserRepository();
//        UserRepositoryInterface userRepository2 = new UserRepository();
//        // 구현클래스가 인터페이스를 기반으로 구현하기 때문에
//
//        UserService userService1 = new UserService(userRepository);
//        UserService userService2 = new UserService(userRepository2);
//
//        userService1.createUser(new User());
//        userService2.createUser(new User());
//
//        SpringApplication.run(BasicApplication.class, args); //실행코드

//        UserRepositoryInterface userRepository = new UserRepository();
//        UserRepositoryInterface userRepository2 = new UserRepository2();
//
//        UserService userService = new UserService(userRepository);
//        UserService userService1 = new UserService(userRepository2);
//
//        userService.createUser(new User());
//        userService1.createUser(new User());
//
//        SpringApplication.run(BasicApplication.class, args);


@SpringBootApplication
public class BasicApplication {

//    @Value("${kakao.api.key}")
//    private String name;

//    public static void main(String[] args) {
//        UserRepositoryInterface userRepository = new UserRepository();
//
//
//        SpringApplication.run(BasicApplication.class, args);
//    }
    // 인터페이스를 구현한 구현클래스는 상위 인터페이스로 대체 될 수 있다.
// 유저 레포지토리2

    //싱글톤 패턴
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println("====================================");
        System.out.println(singleton1);
        System.out.println("====================================");
        System.out.println(singleton2);

//        Singleton singleton3 = new Singleton();
//        Singleton singleton4 = new Singleton();

//        System.out.println(singleton3);
//        System.out.println("====================================");
//        System.out.println(singleton4);

        // 싱글톤의 가장 큰 특징은 인스턴스가 하나만 있어야 한다.
        //
    }

}



