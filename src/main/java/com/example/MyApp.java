package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService1 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService1.getMessage());

        System.out.println("-------");

        MessageService messageService2 = applicationContext.getBean("randomMessageService", MessageService.class);
        System.out.println(messageService2.getMessage());
        System.out.println("-------");

        System.out.println(messageService1.hashCode());
        System.out.println("-------");
        System.out.println(messageService2.hashCode());




        applicationContext.close();
    }
}
