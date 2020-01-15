package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        MyNameMessageService messageService = ctx.getBean(MyNameMessageService.class);
        RandomTextMessageService messageService1 = ctx.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());

        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        //MessageService messageService2 = applicationContext.getBean("messageService1", MessageService.class);
        //System.out.println(messageService.getMessage());
        //System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());
        //applicationContext.close();
    }
}
