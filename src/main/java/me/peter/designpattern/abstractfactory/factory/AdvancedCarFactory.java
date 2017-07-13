package me.peter.designpattern.abstractfactory.factory;

import me.peter.designpattern.abstractfactory.roof.AdvancedRoof;
import me.peter.designpattern.abstractfactory.roof.Roof;
import me.peter.designpattern.abstractfactory.wheel.AdvancedWheel;
import me.peter.designpattern.abstractfactory.wheel.Wheel;

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
