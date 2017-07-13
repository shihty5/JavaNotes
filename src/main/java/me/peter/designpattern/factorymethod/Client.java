package me.peter.designpattern.factorymethod;

public class Client {

	public static void main(String[] args) {
		Factory myFactory = null;
		myFactory = new BMWFactory();
		
		Car myCar = myFactory.getCar();
		myCar.info();
	}

}
