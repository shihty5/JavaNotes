package me.peter.designpattern.factorymethod;

public class BMWFactory implements Factory {

	@Override
	public Car getCar() {
		return new BMWCar();
	}
	
}
