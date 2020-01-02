package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")

public class MyNameMessageService implements MessageService {
    String name = "Ambroży Pala";
    @Override
    public String getMessage(){
        return name;
    }

}
