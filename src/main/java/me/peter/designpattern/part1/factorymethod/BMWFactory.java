package me.peter.designpattern.part1.factorymethod;

public class BMWFactory implements Factory {

	@Override
	public Car getCar() {
		return new BMWCar();
	}
	
}
