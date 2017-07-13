package me.peter.designpattern.simplefactory;

public class BMWCar extends Car {

	@Override
	public void madeFrom() {
		System.out.println("I'm made from BMW.");
	}

}
