package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component("messageService2")

public class RandomTextMessageService implements MessageService{

    List<String> message = new ArrayList<String>(Arrays.asList("Message1", "Message2","Message3","Message4","Message5","Message6","Message7","Message8","Message9","Message10"));

    Random r = new Random();
    int a = r.nextInt(10);

    @Override
    public String getMessage(){
        return message.get(a);
    }
}

