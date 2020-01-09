package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("messageRandomService")

public class RandomTextMessageService implements MessageService {
    List<String> messages = new ArrayList<>(Arrays.asList("Marek", "Andrzej", "Dawid", "Michal", "Karol", "Marek", "Pawel", "Gienio", "Lukasz", "Kacper"));

    @Override
    public String getMessage() {
        int rnd = new Random().nextInt(messages.size());
        return messages.get(rnd);
    }
}
