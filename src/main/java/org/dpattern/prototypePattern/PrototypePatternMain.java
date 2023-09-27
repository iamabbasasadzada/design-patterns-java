package org.dpattern.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternMain {
    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("Mercedes", "G63", 300),
                new Car("McLaren", "Speedtail", 500)
        );

        List<Vehicle> copyVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyVehicles.add(vehicle.clone());
        }

        copyVehicles.forEach(System.out::println);

    }
}
