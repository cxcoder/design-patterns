package org.cx.abstractfactory;

/**
 * ConcreteFactory
 * 
 * <p>Inspiron 系列产品工厂
 */
public class InspironFactory implements DellFactory {

    @Override
    public Computer makeComputer() {
        return new Computer();
    }

    @Override
    public Cpu makeCpu() {
        return new AmdCpu();
    }

    @Override
    public HardDrive makeHardDrive() {
        return new HDD();
    }

}
