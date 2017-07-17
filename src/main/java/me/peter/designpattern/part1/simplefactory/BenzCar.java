package me.peter.designpattern.part1.simplefactory;

public class BenzCar extends Car {

	@Override
	public void madeFrom() {
		System.out.println("I'm made from Benz.");
	}

}
