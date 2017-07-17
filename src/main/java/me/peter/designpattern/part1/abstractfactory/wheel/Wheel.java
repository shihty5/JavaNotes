package me.peter.designpattern.part1.abstractfactory.wheel;

public abstract class Wheel {
	
	protected String spec = null;

	public abstract void setWheelSpec();
	
	public String getWheel(){
		return this.spec;
	}
}
