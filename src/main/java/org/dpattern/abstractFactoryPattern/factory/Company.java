package org.dpattern.abstractFactoryPattern.factory;

import org.dpattern.abstractFactoryPattern.product.Keyboard;
import org.dpattern.abstractFactoryPattern.product.Mouse;

public abstract class Company {
    public abstract Mouse createMouse();
    public abstract Keyboard createKeyboard();
}
