package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("messageRandomService")
public class RandomTextMessageService implements MessageService {

    List<String> messages = new ArrayList<>(Arrays.asList("hello", "world", "Ala", "ma", "kota", "losowa", "wiadomosc"
    ,"123", "321", "politechnika"));

    @Override
    public String getMessage() {
        return messages.get(randomNumber(9));
    }

    private int randomNumber(int maxNumber){
        return (int)(Math.random()*maxNumber);
    }
}
