package org.dpattern.prototypePattern;

public abstract class Vehicle {
    private final String brand;
    private final String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected Vehicle(Vehicle vehicle){
        this.brand=vehicle.brand;
        this.model = vehicle.model;
    }
    public abstract Vehicle clone();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
