package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {
    private List<String> messageList = new ArrayList<String>(10);
    Random randInt = new Random();
    public RandomTextMessageService(){
        for (int i=0; i<10; i++){
            messageList.add("Random Message nr " + i);
        }
    }

    @Override
    public String getMessage() {
        return messageList.get(getRandomNumber(10));
    }

    private int getRandomNumber(int limit){
        return randInt.nextInt(limit);
    }
}
