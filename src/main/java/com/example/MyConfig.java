package com.example;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(RandomTextMessageService.class)

public class MyConfig {
    @Bean
    @Scope("prototyp")
    public MessageService myMessage() { //myNameMessage
        return new MyNameMessageService();
    }
}
