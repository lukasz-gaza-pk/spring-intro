package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{
    Random rand;

    private final ArrayList<String> listOfRandomMessages;


    public RandomTextMessageService() {
        this.listOfRandomMessages = new ArrayList<>(Arrays.asList("1 wiadomość", "2 wiadomość", "3 wiadomość", "4 wiadomość", "5 wiadomość", "6 wiadomość",
                "7 wiadomość", "7 wiadomość", "9 wiadomość", "10 wiadomość"));
    }

    @Override
    public String getMessage() {
        rand = new Random();

        int index = rand.nextInt(this.listOfRandomMessages.size());
        return this.listOfRandomMessages.get(index);
    }
}


