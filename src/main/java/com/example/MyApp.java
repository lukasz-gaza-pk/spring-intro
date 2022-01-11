package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("messageRandomService", MessageService.class);
        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());
        System.out.println("Hash code 0 = " + messageService.hashCode());
        System.out.println("Hash code 1 = " + messageService1.hashCode());
        applicationContext.close();
    }
}
