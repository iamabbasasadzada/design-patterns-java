package org.dpattern.prototypePattern;

public class Car extends Vehicle{

    private int speed;

    public Car(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }

    protected Car(Car car){
        super(car);
        this.speed=car.speed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
