package org.cx.factory;

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
