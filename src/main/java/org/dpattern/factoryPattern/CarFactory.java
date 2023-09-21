package org.dpattern.factoryPattern;

public abstract class CarFactory {

    public void buildCar(){
        System.out.println("Creating car!");
        Car car = getCar();
        car.createCar();
    }

    public abstract Car getCar();
}
