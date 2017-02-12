package org.cx.factory;

/**
 * Inspiron 系列产品工厂.
 */
public class InspironCreator extends Creator  {

    @Override
    public Cpu makeCpu() {
        return new AmdCpu();
    }

    @Override
    public HardDrive makeHardDrive() {
        return new HDD();
    }

}
