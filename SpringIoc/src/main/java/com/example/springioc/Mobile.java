package com.example.springioc;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("I");
        Airtel airtel=(Airtel) context.getBean("airtel");
        Jio jio=(Jio) context.getBean("jio");
        airtel.calling();
        airtel.data();
        jio.calling();
        jio.data();
    }
}
