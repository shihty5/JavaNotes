package me.peter.designpattern.abstractfactory.factory;

import me.peter.designpattern.abstractfactory.roof.Roof;
import me.peter.designpattern.abstractfactory.wheel.Wheel;

public interface CarFactory {
	public Roof createRoof();
	public Wheel createWheel();
}
