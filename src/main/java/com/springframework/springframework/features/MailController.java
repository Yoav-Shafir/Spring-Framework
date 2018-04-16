package com.springframework.springframework.features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender;

    // We have 2 implementation of the MailSender interface.
    // Still we manage to inject the smtpMailSender implementation without spring to throw an error,
    // It can be done if the arg name is the actual Bean name - smtpMailSender (camel case) is the name of the Bean SmtpMailSender.

    @Autowired
    public MailController(MailSender smtpMailSender) {
        this.mailSender = smtpMailSender;
    }

    @RequestMapping("/mail")
    public String mail() {
        mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
        return "mail sent";
    }
}
