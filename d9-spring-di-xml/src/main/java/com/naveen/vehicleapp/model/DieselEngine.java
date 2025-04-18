package com.naveen.vehicleapp.model;

public class DieselEngine implements Engine
{
	public String start()
	{
		System.out.println("Diesel engine started");
		return "success";
	}
	
	DieselEngine()
	{
		System.out.println("DieselEngine Constructor called.");
	}
}
