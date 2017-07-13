package me.peter.designpattern.abstractfactory.factory;

import me.peter.designpattern.abstractfactory.roof.CheapRoof;
import me.peter.designpattern.abstractfactory.roof.Roof;
import me.peter.designpattern.abstractfactory.wheel.CheapWheel;
import me.peter.designpattern.abstractfactory.wheel.Wheel;

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
