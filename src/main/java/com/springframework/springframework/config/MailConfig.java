package com.springframework.springframework.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {

    // This is an example for making the mail senders classes to injectable beans.
    // However, at the moment they have the @Component annotation.

    /*

    // the name of this Bean will be the same as the method's name.
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    // the name of this Bean will be the same as the method's name.
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
     */
}
