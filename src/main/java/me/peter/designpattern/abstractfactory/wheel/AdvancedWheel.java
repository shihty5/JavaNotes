package me.peter.designpattern.abstractfactory.wheel;

public class AdvancedWheel extends Wheel {

	public AdvancedWheel(){
		setWheelSpec();
	}
	
	@Override
	public void setWheelSpec() {
		this.spec = "This is a advanced wheel.";
	}
	

}
