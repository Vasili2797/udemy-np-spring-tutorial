package com.naturalprogrammer.udemynpspring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
//Name of the bean
@Component("smtp")
public class SmtpMailSender implements MailSender {
    
    private static Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sendin SMTP mail to " + to);
        log.info("With subject " + subject);
        log.info("and body " + body);
    }
    
}
