package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("StandardMessageService", MessageService.class);

        System.out.println(messageService.getMessage());

        MessageService messageService2 = applicationContext.getBean("RandomMessageService", MessageService.class);

        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());

        applicationContext.close();
    }
}
