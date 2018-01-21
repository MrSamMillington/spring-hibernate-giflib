package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//web layer - controllers
//data access layer -- DAO class and enttiy class -> hibernate
//service -- controller -> service layer -> DAO

//h2 server -> java -cp h2-1.4.190.jar org.h2.tools.Server
