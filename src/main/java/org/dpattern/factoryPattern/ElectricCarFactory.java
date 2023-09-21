package org.dpattern.factoryPattern;

public class ElectricCarFactory extends CarFactory{
    @Override
    public Car getCar() {
        return new ElectricCar();
    }
}
