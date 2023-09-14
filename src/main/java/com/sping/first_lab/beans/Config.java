package com.sping.first_lab.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Config {
    @Bean("first")
    @Order(1)
    public String getFirstBean() {
        return "First";
    }
    @Bean("second")
    @Order(2)
    public String getSecondBean() {
        return "Second";
    }
}