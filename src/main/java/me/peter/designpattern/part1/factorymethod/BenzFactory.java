package me.peter.designpattern.part1.factorymethod;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new BenzCar();
	}

}
