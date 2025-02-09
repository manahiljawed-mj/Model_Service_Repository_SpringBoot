package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private int laptopId;
    private String laptopName;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
}
