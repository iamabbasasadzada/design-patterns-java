package org.dpattern.builderPattern.model;

public class PhoneBuilder {
    private String name;
    private String model;
    private String color;
    private int weight;
    private double screenSize;

    public PhoneBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder model(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder color(String color) {
        this.color = color;
        return this;
    }

    public PhoneBuilder weight(int weight) {
        this.weight = weight;
        return this ;
    }

    public PhoneBuilder screenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone build(){
        return new Phone(name,model,color,weight,screenSize);
    }
}
