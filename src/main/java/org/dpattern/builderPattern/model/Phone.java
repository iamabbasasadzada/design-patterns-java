package org.dpattern.builderPattern.model;

public class Phone {
    private String name;
    private String model;
    private String color;
    private int weight;
    private double screenSize;

    public Phone(String name, String model, String color, int weight, double screenSize) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                '}';
    }
}
