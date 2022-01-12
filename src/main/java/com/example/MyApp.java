package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService messageService2 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage() + " --- " + messageService2.getMessage());
        System.out.println(messageService.getMessage().hashCode() + " --- " + messageService2.getMessage().hashCode());

    }
}
