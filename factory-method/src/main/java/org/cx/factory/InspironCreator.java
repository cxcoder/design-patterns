package org.cx.factory;

/**
 * ConcreteCreator
 * 
 * <p>Inspiron 系列产品工厂
 */
public class InspironCreator extends Creator {

    @Override
    public Cpu makeCpu() {
        return new AmdCpu();
    }

    @Override
    public HardDrive makeHardDrive() {
        return new HDD();
    }

}
