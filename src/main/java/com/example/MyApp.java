package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApp.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);
        System.out.println(messageService.getMessage());
        System.out.println(messageService.hashCode());

        MessageService messageService2 = ctx.getBean("messageService2", MessageService.class);
        System.out.println(messageService2.getMessage());
        System.out.println(messageService2.hashCode());


    }
}
