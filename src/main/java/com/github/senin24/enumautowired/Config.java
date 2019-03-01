package com.github.senin24.enumautowired;

import com.github.senin24.enumautowired.model.Parameter;
import com.github.senin24.enumautowired.model.ParameterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Parameter getParameter() {
        System.out.println("@Bean public Parameter getParameter()");
        return new ParameterImpl();
    }
}
