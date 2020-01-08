package com.example;

import org.springframework.stereotype.Component;

@Component("StandardMessageService")
public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "125683";
    }
}
