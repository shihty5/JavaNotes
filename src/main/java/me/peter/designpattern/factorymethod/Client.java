package me.peter.designpattern.factorymethod;

/*
 * Each factory makes their own product.
 */
public class Client {

	public static void main(String[] args) {
		Factory myFactory = null;
		myFactory = new BMWFactory();
		
		Car myCar = myFactory.getCar();
		myCar.info();
	}

}
