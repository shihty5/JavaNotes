package me.peter.designpattern.part1.simplefactory;

public class Client {

	public static void main(String[] args) {
		Car myCar = null;
		
		myCar = CarFactory.getCar("BMW");
		myCar.basic();
		myCar.madeFrom();
	}

}
