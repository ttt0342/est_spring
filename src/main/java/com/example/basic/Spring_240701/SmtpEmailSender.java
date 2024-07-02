package com.example.basic.Spring_240701;

public class SmtpEmailSender implements EmailSender{

    @Override
    public void sendEmail(String to, String subject, String body) {
        // SMTP 기술을 활용한 로직이 들어가는 자리(로직 구현)
        System.out.println("Sending SMTP email to " + to);
    }
}
