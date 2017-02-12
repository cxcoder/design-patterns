package org.cx.abstractfactory;

/**
 * ConcreteProduct
 * <p>
 * Intel CPU
 */
public class IntelCpu extends Cpu {
    @Override
    public String name() {
        return "Intel";
    }
}
