package org.dpattern.builderPattern;

import org.dpattern.builderPattern.model.PhoneBuilder;

public class BuilderPatternMain {

    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Director director= new Director();
        director.iPhoneBuild(phoneBuilder);
        System.out.println(phoneBuilder.build());
    }
}
