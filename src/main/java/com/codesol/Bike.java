package com.codesol;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public void drive()
    {
        System.out.println("This is a Bike you are Cycling me...");
    }
}
