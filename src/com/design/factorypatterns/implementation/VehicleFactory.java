package com.design.factorypatterns.implementation;

import com.design.patterns.Vehicle;
import com.design.patterns.implementation.Bike;
import com.design.patterns.implementation.Car;

public class VehicleFactory {

	public static Vehicle getVehicle(String vehicleType)
	{
		if(vehicleType==null|| vehicleType.isEmpty())
		{
			return null;
		}
		switch(vehicleType)
		{
		case "Bike":
			 	return new Bike();
		
		case "Car":
			    return new Car();
		default:
            throw new IllegalArgumentException("vehicleType channel "+vehicleType);			    
		}

	}
}
