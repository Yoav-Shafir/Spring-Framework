package com.springframework.springframework.features.mail;

public interface MailSender {
    void send(String to, String subject, String body);
}
