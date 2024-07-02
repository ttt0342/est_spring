package com.example.basic.Spring_240701;

public class EmailService {
    // public void sendEmail(String to, String subject, String body) {}
    // SMTP를 사용하여 이메일 발송 - SMTP라는 기술에 종속되어 있다 = 강결합
    // -> 다른 기술로 발송방식을 사용하게 된다면(의존하는 기술이 변경된다.)
    // -> 변경할 기술 기반으로 코드를 전면 수정해야 한다.

    // DIP 지키고 있다.
    // 인터페이스에 의존한다면 다른 기술로 변경한다면 코드를 변경할 필요 없다.
    // -> 인터페이스에 의존하고 있기 떄문에 기능을 구현한 구현 클래스에서만 수정하면 되기 때문
    // 유지보수성이 좋다. 실무에서 많이 사용하는 방식

    private final EmailSender emailSender; //초기화 된 상태(final) - 안전성을 가지고 있음

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String to, String subject, String body) {
        emailSender.sendEmail(to, subject, body);
    }
}
