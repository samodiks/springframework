package com.codesol;

import org.springframework.stereotype.Component;

//import jdk.nashorn.internal.parser.JSONParser;
@Component
public   class Car implements Vehicle{
    public void drive()
    {
        System.out.println("Drive me...");
    }
}
