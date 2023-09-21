package org.dpattern.factoryPattern;

public class GasCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Gas car creating");
    }
}
