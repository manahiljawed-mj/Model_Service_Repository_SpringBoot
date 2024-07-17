package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component("ExtremeCalc")
public class ExtremeCalc implements ScientificCalc {
    public boolean property=true;
    public void displayScientific()
    {
        System.out.println("Extreme Calculator");
    }
}
