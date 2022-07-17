/**
 * 
 */
package com.design.factory.main;

import java.util.Scanner;

import com.design.factorypatterns.implementation.VehicleFactory;
import com.design.patterns.Vehicle;

/**
 * @author Admin
 *  After implementing factory deisgn pattern
 */
public class ClientFactoryPattern {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String vehicleType = scanner.nextLine();
		
		Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
		vehicle.createVehicle();
	}

}
