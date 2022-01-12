package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("messageService2")
public class RandomTextMessageService implements MessageService {
    private final ArrayList<String> messages = new ArrayList<>(List.of("ran1", "ran2", "ran3", "ran4", "ran5", "ran6",
            "ran7", "ran8", "ran9", "ran10"));

    @Override
    public String getMessage() {
        Random random = new Random();
        int randomIndex = random.nextInt(messages.size());
        return messages.get(randomIndex);
    }
}
