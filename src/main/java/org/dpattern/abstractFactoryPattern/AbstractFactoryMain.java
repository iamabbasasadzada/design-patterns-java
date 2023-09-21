package org.dpattern.abstractFactoryPattern;

import org.dpattern.abstractFactoryPattern.factory.Company;
import org.dpattern.abstractFactoryPattern.factory.HpFactory;
import org.dpattern.abstractFactoryPattern.factory.RazorFactory;
import org.dpattern.abstractFactoryPattern.product.Product;

import java.util.List;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Company razorCompany= new RazorFactory();
        Company hpCompany = new HpFactory();
        List.of(razorCompany.createMouse(),razorCompany.createKeyboard()
                ,hpCompany.createMouse(),hpCompany.createKeyboard()).forEach(Product::assemble);
    }
}
