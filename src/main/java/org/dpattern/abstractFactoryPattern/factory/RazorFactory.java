package org.dpattern.abstractFactoryPattern.factory;

import org.dpattern.abstractFactoryPattern.product.Keyboard;
import org.dpattern.abstractFactoryPattern.product.Mouse;
import org.dpattern.abstractFactoryPattern.product.RazorKeyboard;
import org.dpattern.abstractFactoryPattern.product.RazorMouse;

public class RazorFactory extends Company {
    @Override
    public Mouse createMouse() {
        return new RazorMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazorKeyboard();
    }
}
