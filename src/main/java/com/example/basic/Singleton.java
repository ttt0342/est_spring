package com.example.basic;

public class Singleton {
    private static final Singleton instance = new Singleton();
    // 자기가 자기자신을 만듦, 인스턴스에 하나의 인스턴스만 만들어야 한다.
    // JVM에 올라가면 성질을 바꿀 수 없음

    // instance에 싱글톤으로 부터 만들어진 객체가 들어가게 된다.

    private Singleton() {
        // 퍼블릭으로 하면 인스턴스가 2개 이상으로 만들어질 수 있어 싱글톤 패턴이 아님
        // 단순히 프라이빗으로 막으면 에러 발생
        // 외부에서 생성자를 호출할 수 없도로 프라이빗으로

        // 인스턴스만 가져올 수 있는 메서드가 필요하다.
    }

    public static Singleton getInstance() {
        return instance;
        //스태틱으로 만들어 준 이유 = 정적으로 만들어줬으므로, 생성자를 막아주었기 때문
    }
        // 인스턴스만 반환하는 정적 메서드를 생성

    public static void main(String[] args) {
        getInstance();
    }
}
