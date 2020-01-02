package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNameMessageServiceTest {

    @Test
    public void shouldReturnMyNameAsMessage() {
        String expectedMessage = "Ambroży Pala";
        MyNameMessageService myNameMessageService = new MyNameMessageService();
        RandomTextMessageService randomTextMessageService = new RandomTextMessageService();
        System.out.println(randomTextMessageService.getMessage());
        assertEquals(expectedMessage, myNameMessageService.getMessage());
    }
}
