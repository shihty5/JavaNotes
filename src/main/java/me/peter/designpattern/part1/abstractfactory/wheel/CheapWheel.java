package me.peter.designpattern.part1.abstractfactory.wheel;

public class CheapWheel extends Wheel {

    public CheapWheel() {
        setWheelSpec();
    }

    @Override
    public void setWheelSpec() {
        this.spec = "This is a normal wheel.";
    }

}
