package com.studies.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void send(String message){
        System.out.println("Enviado email: " + message);
    }
}
