package com.example.basic.Spring_240701;

public class Account {
    private String accountNumber; //계좌번호
    private double balance; //돈

    public void changeAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber; //계좌번호를 변경하는 로직 = 비즈니스 로직
    }

    public void drawMoney(double money) {
        if (balance < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= money;
    }
}
