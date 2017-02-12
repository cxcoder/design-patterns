package org.cx.abstractfactory;

/**
 * ConcreteProduct
 * <p>
 * HDD
 */
public class HDD extends HardDrive {
    @Override
    public String name() {
        return "HDD";
    }
}
