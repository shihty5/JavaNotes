package me.peter.designpattern.simplefactory;

public class Client {

	public static void main(String[] args) {
		Car myCar = null;
		
		myCar = CarFactory.getCar("BMW");
		myCar.basic();
		myCar.madeFrom();
	}

}
