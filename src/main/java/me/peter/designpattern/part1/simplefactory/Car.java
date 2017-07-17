package me.peter.designpattern.part1.simplefactory;

public abstract class Car {
	
	//common part.
	public void basic() {
		System.out.println("I have 4 wheels");
	}
	
	//Concrete class will complete this.
	public abstract void madeFrom();
}
