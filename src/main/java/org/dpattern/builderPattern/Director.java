package org.dpattern.builderPattern;

import org.dpattern.builderPattern.model.PhoneBuilder;

public class Director {
    public void iPhoneBuild(PhoneBuilder phoneBuilder){
        phoneBuilder
        .name("Apple")
                .model("iPhone 15")
                .screenSize(6.5)
                .color("Black")
                .weight(-1);
    }

    public void samsungBuild(PhoneBuilder phoneBuilder){
        phoneBuilder
                .name("Samsung")
                .model("Galaxy S33")
                .screenSize(7)
                .color("Black")
                .weight(175);
    }
}
