package com.example;
import org.springframework.context.annotation.*;

@Configuration
public class Config {
    @Bean
    public MyNameMessageService messageService(){
        return new MyNameMessageService();
    }
    @Bean
    public RandomTextMessageService messageService1(){
        return new RandomTextMessageService();
    }
}
