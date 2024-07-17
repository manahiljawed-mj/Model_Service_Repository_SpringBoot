package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    @Qualifier("ExtremeCalc")
   private ScientificCalc cal;

    public ScientificCalc getCal() {
        return cal;
    }

    public void setCal(ScientificCalc cal) {
        cal.displayScientific();
        this.cal = cal;
    }

    public int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
    public int subtract(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }
    public int multiply(int a, int b) {

        System.out.println(a * b);
        return a * b;
    }
    public int divide(int a, int b) {
        System.out.println(a / b);
        return a / b;
    }

}
