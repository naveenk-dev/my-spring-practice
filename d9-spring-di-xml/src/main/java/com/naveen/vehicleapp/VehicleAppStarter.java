package com.naveen.vehicleapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.vehicleapp.model.*;

public class VehicleAppStarter 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = context.getBean("car", Car.class);
		car.drive();
        ((ClassPathXmlApplicationContext) context).close();
	}
	
}

