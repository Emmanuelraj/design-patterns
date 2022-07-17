/**
 * 
 */
package com.design.patterns.main;

import java.util.Scanner;

import com.design.patterns.Vehicle;
import com.design.patterns.implementation.Bike;
import com.design.patterns.implementation.Car;

/**
 * @author Admin
 * without Factory Pattern implement Client
 */
public class Client {


	public static void main(String[] args) {

		/**
		 * Before Factory
		 * 
		 * 		 * 
		 */
		Scanner vehicleType = new Scanner(System.in);
		String v = vehicleType.nextLine();
         
		Vehicle vehicle ;

		if(v.equals("Car")) 
		{
			vehicle = new Car();
			vehicle.createVehicle();
		}else 
			if(v.equals("Bike")) {
    			vehicle = new Bike();
    			vehicle.createVehicle();
		} 

	}

}
