package me.peter.designpattern.part1.abstractfactory.factory;

import me.peter.designpattern.part1.abstractfactory.roof.CheapRoof;
import me.peter.designpattern.part1.abstractfactory.roof.Roof;
import me.peter.designpattern.part1.abstractfactory.wheel.CheapWheel;
import me.peter.designpattern.part1.abstractfactory.wheel.Wheel;

public class CheapCarFactory implements CarFactory {

	@Override
	public Roof createRoof() {
		return new CheapRoof();
	}

	@Override
	public Wheel createWheel() {
		return new CheapWheel();
	}

}
