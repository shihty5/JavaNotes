package me.peter.designpattern.part1.abstractfactory;

import me.peter.designpattern.part1.abstractfactory.factory.AdvancedCarFactory;
import me.peter.designpattern.part1.abstractfactory.factory.CarFactory;
import me.peter.designpattern.part1.abstractfactory.roof.Roof;
import me.peter.designpattern.part1.abstractfactory.wheel.Wheel;

public class Client {

	public static void main(String[] args) {
		Roof roof = null;
		Wheel wheel = null;
		CarFactory myFac = null;
		
		myFac = new AdvancedCarFactory();
		
		roof = myFac.createRoof();
		wheel = myFac.createWheel();
		
		System.out.println(roof.isConvertible());
		System.out.println(wheel.getWheel());
		
		
	}

}
