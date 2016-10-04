package com.marash.general.simpleWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marash.general.configuration.mainConfiguration;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Simple Web Service is running!" );
        SpringApplication.run(mainConfiguration.class, args);
    }
}
