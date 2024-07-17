package com.example.demo.service;

import com.example.demo.model.ExtremeCalc;
import com.example.demo.repository.ExtremeCalcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ExtremeCalcService")
public class ExtremeCalcService {

    @Autowired
    ExtremeCalcRepository extremeCalcRepository;
    public void checkProperty(ExtremeCalc cal)
    {
        if(cal.property)
        {
            System.out.println("Property is set to true");

        }
        else {
            System.out.println("Property is set to false");
        }
    }

    public void addProperty() throws Exception {

        extremeCalcRepository.add();
        extremeCalcRepository.databaseConnection();

    }
}
