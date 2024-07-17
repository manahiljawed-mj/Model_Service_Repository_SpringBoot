package com.example.demo;

import com.example.demo.model.ExtremeCalc;
import com.example.demo.model.Laptop;
import com.example.demo.repository.ExtremeCalcRepository;
import com.example.demo.service.ExtremeCalcService;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws Exception {

		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
		Laptop lp=ac.getBean(Laptop.class);
		lp.setLaptopId(2);
		lp.setLaptopName("Hp");

		LaptopService ls=ac.getBean(LaptopService.class);
		ls.showInfo();


	}
}
