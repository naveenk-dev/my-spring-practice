package com.naveen.vehicleapp.model;

public class PetrolEngine implements Engine
{
	public String start()
	{
		System.out.println("PetrolEngine: Engine started.");
		return "success";
	}
	
	PetrolEngine()
	{
		System.out.println("PetrolEngine: Constructor called.");
	}
}
