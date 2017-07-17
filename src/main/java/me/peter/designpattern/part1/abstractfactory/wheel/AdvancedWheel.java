package me.peter.designpattern.part1.abstractfactory.wheel;

public class AdvancedWheel extends Wheel {

	public AdvancedWheel(){
		setWheelSpec();
	}
	
	@Override
	public void setWheelSpec() {
		this.spec = "This is a advanced wheel.";
	}
	

}
