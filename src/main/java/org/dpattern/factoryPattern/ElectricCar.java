package org.dpattern.factoryPattern;

public class ElectricCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Electric car creating..");
    }
}
