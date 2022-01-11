package com.example;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configuration
public class RandomTextMessageConfig {
    @Bean
    @Scope("prototyp")
    public MessageService randomTextMessage() {
        return new RandomTextMessageService();
    }
}