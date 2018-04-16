package com.springframework.springframework.features;

public interface MailSender {
    void send(String to, String subject, String body);
}
