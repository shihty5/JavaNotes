package me.peter.designpattern.part2.adapter;

public class NewEngine extends OldEngine implements IEngine {

	@Override
	public int outputPower() {
		return super.outputPower() + 50;
	}

}
