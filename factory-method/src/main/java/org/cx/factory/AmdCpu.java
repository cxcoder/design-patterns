package org.cx.factory;

/**
 * ConcreteProduct
 * 
 * <p>AMD CPU
 */
public class AmdCpu extends Cpu {
    @Override
    public String name() {
        return "AMD";
    }
}
