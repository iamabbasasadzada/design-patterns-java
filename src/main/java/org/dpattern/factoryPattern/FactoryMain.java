package org.dpattern.factoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        CarFactory carFactory = new ElectricCarFactory();
        carFactory.buildCar();

        System.out.println("-----------------------------");

        CarFactory gasCarFactory=new GasCarFactory();
        gasCarFactory.buildCar();
    }
}
