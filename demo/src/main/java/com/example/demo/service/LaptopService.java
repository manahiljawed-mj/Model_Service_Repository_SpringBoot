package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    Laptop lp;

    @Autowired
    LaptopRepository lr;

    private int id;
    private String brand;

    public void showInfo() throws Exception
    {
       id=lp.getLaptopId();
       brand=lp.getLaptopName();
       System.out.println("Laptop ID: "+id);
       System.out.println("Laptop Name: "+brand);
       lr.insertInfo(id,brand);

    }
}
