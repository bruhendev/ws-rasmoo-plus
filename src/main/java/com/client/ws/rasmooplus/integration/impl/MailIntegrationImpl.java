package com.client.ws.rasmooplus.integration.impl;

import com.client.ws.rasmooplus.integration.MailIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailIntegrationImpl implements MailIntegration {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void send(String mailto, String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(mailto);
        simpleMailMessage.setSubject("Acesso Liberado");
        simpleMailMessage.setText("Login :"+mailto+" Senha: alunorasmoo");
        javaMailSender.send(simpleMailMessage);
    }
}
