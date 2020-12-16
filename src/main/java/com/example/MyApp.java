package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(MyConfig.class);
        MessageService messageService = appContext.getBean(MyNameMessageService.class);
        MessageService secondmessageService = appContext.getBean(RandomTextMessageService.class);
        System.out.println(messageService.getMessage());
        System.out.println(secondmessageService.getMessage());
        System.out.println(secondmessageService.hashCode());
    }
}
