package com.example.basic.Spring_240701;

public class AwsEmailSender implements EmailSender{
    @Override
    public void sendEmail(String to, String subject, String body) {
        // AWS SES 기술을 활용한 메세지 전송 로직 구현
        System.out.println("Sending AWS SES email to " + to);
    }
}
