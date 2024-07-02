package com.example.basic.Spring_240701;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);

    // 이메일 센더만 구현하여 각 기술에서 다르게 구현할 수 있다.
}
