package org.cx.factory;

/**
 * ConcreteCreator
 * <p>
 * Xps 系列产品工厂
 */
public class XpsCreator extends Creator {
    
    @Override
    public Cpu makeCpu() {
        return new IntelCpu();
    }

    @Override
    public HardDrive makeHardDrive() {
        return new SSD();
    }

}