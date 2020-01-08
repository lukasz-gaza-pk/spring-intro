package com.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Component("RandomMessageService")
public class RandomTextMessageService implements MessageService {
    final List<String> elements = Arrays.asList("0","1","2","3","4","5","6","7","8","9");

    @Override
    public String getMessage() {
        return elements.get(new Random().nextInt(elements.size()));
    }
}
