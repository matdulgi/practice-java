package com.dulgi.practice.java.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    public TestConfiguration(){
        System.out.println("TestConfiguration");
    }

    @Bean
    public String beanA(){
        System.out.println("beanA created");
        return new String("StringA");
    }

    @Bean
    public String beanB(@Autowired String beanA){
        System.out.println("beanB created");
        System.out.println("arg beanA : " + beanA);
        return new String(beanA);
    }
}
