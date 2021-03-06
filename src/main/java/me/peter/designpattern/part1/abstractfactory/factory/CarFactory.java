package me.peter.designpattern.part1.abstractfactory.factory;

import me.peter.designpattern.part1.abstractfactory.roof.Roof;
import me.peter.designpattern.part1.abstractfactory.wheel.Wheel;

public interface CarFactory {
    Roof createRoof();

    Wheel createWheel();
}
