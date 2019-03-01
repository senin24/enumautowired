package com.github.senin24.enumautowired;

import com.github.senin24.enumautowired.model.ParameterI;
import com.github.senin24.enumautowired.model.ParameterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ParameterI getParameter() {
        System.out.println("@Bean public ParameterI getParameter()");
        return new ParameterImpl();
    }
}
