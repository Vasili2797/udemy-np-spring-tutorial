package com.naturalprogrammer.udemynpspring5tutorial.mail;

public interface MailSender {
    void send(String to, String subject, String body);
    

}
