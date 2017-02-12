package org.cx.abstractfactory;

/**
 * ConcreteProduct
 * <p>
 * Intel CPU
 * @author cyhe
 */
public class IntelCpu extends Cpu {
    @Override
    public String name() {
        return "Intel";
    }
}
