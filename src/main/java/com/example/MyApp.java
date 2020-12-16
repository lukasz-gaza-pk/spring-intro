package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());

        MessageService anotherMessageService = applicationContext.getBean("messageRandomService", MessageService.class);

        System.out.println(anotherMessageService.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(anotherMessageService.hashCode());

        applicationContext.close();
    }
}
