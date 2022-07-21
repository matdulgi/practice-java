package com.dulgi.practice.java.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

import javax.naming.event.EventContext;

public class Starter {

    @Autowired
    String beanB;

    @Autowired
    ApplicationContext applicationContext;

    @EventListener(ApplicationReadyEvent.class)
    public void start(){
        System.out.println(beanB);
        System.out.println(applicationContext);


    }
}
