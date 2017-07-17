package me.peter.designpattern.part1.simplefactory;

public class BMWCar extends Car {

	@Override
	public void madeFrom() {
		System.out.println("I'm made from BMW.");
	}

}
