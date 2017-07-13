package me.peter.designpattern.simplefactory;

public class CarFactory {
	
	public static Car getCar(String type){
		
		Car car = null;
		
		if(type.equals("BMW")){
			car = new BMWCar();
		}
		
		if(type.equals("Benz")){
			car = new BenzCar();
		}
		
		return car;
	}
}
