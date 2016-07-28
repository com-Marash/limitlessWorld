package com.marash.general.simpleWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Simple Web Service is running!" );
        SpringApplication.run(App.class, args);
    }
}
