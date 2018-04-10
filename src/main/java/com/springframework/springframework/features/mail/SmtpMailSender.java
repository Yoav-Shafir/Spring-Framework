package com.springframework.springframework.features.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

// By default the name of this Bean in the Application Context will be
// the name of the class in camel case - `smtpMailSender`.\
// We can change this by specifying a custom name for example `smtp`.
// @Component("smtp")

@Component
public class SmtpMailSender implements MailSender {

    private static Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " + to);
        log.info("Sending subject " + subject);
        log.info("and body " + body);
    }
}
