package me.peter.designpattern.factorymethod;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new BenzCar();
	}

}
