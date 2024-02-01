package com.naturalprogrammer.udemynpspring5tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.udemynpspring5tutorial.mail.MailSender;

@RestController
public class MailController {

//    @Autowired
    private MailSender mailSender;

    public MailController(MailSender smtp){
        this.mailSender=smtp;
    }
//
//    public void setMailSender(MailSender mailSender) {
//        this.mailSender = mailSender;
//    }

    @RequestMapping("/mail")
    public String mail() {
        mailSender.send("mail.example.com", "A test mail", "Body of the test");
        return "Mail Sent";
    }
}
