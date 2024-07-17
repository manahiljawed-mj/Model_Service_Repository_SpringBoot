package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Advance_Calculator implements ScientificCalc {

    public void displayScientific()
    {
        System.out.println("Advance Calculator");
    }

    public int addSubtract(int a,int b)
    {
        int i=a+b;
        int j=a-b;
        return i+j;
    }
}
