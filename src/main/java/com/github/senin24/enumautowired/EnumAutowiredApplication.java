package com.github.senin24.enumautowired;

import com.github.senin24.enumautowired.model.Wrapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnumAutowiredApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EnumAutowiredApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Get param 1 from Enum with @Autowired field 'Param': " + Wrapper.PARAM.SOME_PARAM1.getValue());
        System.out.println("Get param 2 from Enum with @Autowired field 'Param': " + Wrapper.PARAM.SOME_PARAM2.getValue());
        System.out.println("Get param 3 from Enum with @Autowired field 'Param': " + Wrapper.PARAM.SOME_PARAM3.getValue());
    }
}
