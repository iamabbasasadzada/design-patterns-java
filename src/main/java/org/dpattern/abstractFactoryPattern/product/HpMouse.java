package org.dpattern.abstractFactoryPattern.product;

public class HpMouse implements Mouse{
    @Override
    public void assemble() {
        System.out.println("Creating hp mouse");
    }
}
