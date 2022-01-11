package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService secondmessageService = applicationContext.getBean("RandomMessageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(secondmessageService.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(secondmessageService.hashCode());



        applicationContext.close();
    }
}
