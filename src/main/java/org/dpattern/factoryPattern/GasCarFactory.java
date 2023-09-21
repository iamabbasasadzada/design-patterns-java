package org.dpattern.factoryPattern;

public class GasCarFactory extends CarFactory{
    @Override
    public Car getCar() {
        return new GasCar();
    }
}
