package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component("messageService1")


public class RandomTextMessageService implements MessageService{
    String[] board = new String[10];
    Random random = new Random();

    @Override
    public String getMessage() {
        for (int i = 0; i < board.length; i++){
            board[i] = "Message nr"+i;
            //System.out.println(board[i]);
        }
        String message = board[random.nextInt(10)];
        return message;
    }
}
