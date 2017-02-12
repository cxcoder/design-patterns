package org.cx.abstractfactory;

/**
 * Xps 系列产品工厂.
 */
public class XpsFactory implements DellFactory {
    
    @Override
    public Computer makeComputer() {
        return new Computer();
    }

    @Override
    public Cpu makeCpu() {
        return new IntelCpu();
    }

    @Override
    public HardDrive makeHardDrive() {
        return new SSD();
    }

}