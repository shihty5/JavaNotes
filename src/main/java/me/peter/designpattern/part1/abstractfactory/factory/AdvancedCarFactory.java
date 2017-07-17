package me.peter.designpattern.part1.abstractfactory.factory;

import me.peter.designpattern.part1.abstractfactory.roof.AdvancedRoof;
import me.peter.designpattern.part1.abstractfactory.roof.Roof;
import me.peter.designpattern.part1.abstractfactory.wheel.AdvancedWheel;
import me.peter.designpattern.part1.abstractfactory.wheel.Wheel;

public class AdvancedCarFactory implements CarFactory {

	@Override
	public Roof createRoof() {
		return new AdvancedRoof();
	}

	@Override
	public Wheel createWheel() {
		return new AdvancedWheel();
	}

}
