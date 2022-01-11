package com.example;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Random;

@Component("RandomMessageService")

public class RandomTextMessageService implements MessageService {

    //ArrayList<String> Declaration
    public ArrayList<String> messages = new ArrayList<String>();
    Random rand = new Random();

    //add method for String ArrayList
    public void main(String[] args) {

        messages.add("Message");
        messages.add("News");
        messages.add("Information");
        messages.add("Notice");
        messages.add("Scripture");
        messages.add("Word");
        messages.add("Manifesto");
        messages.add("Proclamation");
        messages.add("Telegram");
        messages.add("Handwriting");

    }

    @Override
        public String getMessage() {
            return messages.get(rand.nextInt(10));
        }
    }


