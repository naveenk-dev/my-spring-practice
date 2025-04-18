package com.naveen.vehicleapp.model;

public class Car 
{
	private Engine eng;
	private String operationStatus=null;
	
	Car()
	{
		System.out.println("Car: Constructor called.");
	}
	public void setEng(Engine eng)
	{		
		System.out.println("Car: Engine dependency injected successfully using "+ eng.getClass().getSimpleName()+".");
		this.eng=eng;
	}
	
	public void drive()
	{
		if (eng == null) 
		{
            System.out.println("Car: No engine found. Cannot drive.");
            return;
		}
		
		operationStatus = eng.start();
		if("success".equals(operationStatus))
		{
			System.out.println("Car: Started successfully with "+ eng.getClass().getSimpleName()+".");
		}
		else
		{
			System.out.println("Car: Trouble!");
		}
		
	}
	
}
