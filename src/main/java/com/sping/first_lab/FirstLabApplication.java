package com.sping.first_lab;

import com.sping.first_lab.beans.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FirstLabApplication implements CommandLineRunner {
    @Autowired
    private List<String> beanList;
    public static void main(String[] args) {
System.out.println("Begin of main :");
        SpringApplication.run(FirstLabApplication.class, args);
        System.out.println("End of main");
    }

    @Override
    public void run (String... args) throws Exception{
         System.out.println(beanList.get(0));
        System.out.println("Hello from spring boot!");
        System.out.println(beanList.get(1));
    }



}
