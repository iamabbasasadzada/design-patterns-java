package org.dpattern.abstractFactoryPattern.factory;

import org.dpattern.abstractFactoryPattern.product.HpKeyboard;
import org.dpattern.abstractFactoryPattern.product.HpMouse;
import org.dpattern.abstractFactoryPattern.product.Keyboard;
import org.dpattern.abstractFactoryPattern.product.Mouse;

public class HpFactory extends Company{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
