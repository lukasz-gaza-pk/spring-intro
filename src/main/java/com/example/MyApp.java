package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService2", MessageService.class);

        System.out.println(messageService.getMessage() + " --- " + messageService2.getMessage());
        System.out.println(messageService.getMessage().hashCode() + " --- " + messageService2.getMessage().hashCode());

        applicationContext.close();
    }
}
