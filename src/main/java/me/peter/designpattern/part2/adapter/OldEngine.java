package me.peter.designpattern.part2.adapter;

public class OldEngine {
	private int horsePower = 0;
	private String light = null;

	public OldEngine() {
		horsePower = 50;
		light = " 卤素大灯 ";
	}

	public int outputPower() {
		return this.horsePower;
	}
	
	public String outputLight(){
		return this.light;
	}
}
