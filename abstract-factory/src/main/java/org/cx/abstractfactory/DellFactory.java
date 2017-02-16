package org.cx.abstractfactory;

/**
 * AbstractFactory
 * 
 * <p>封装创建 <b>产品对象-dell电脑</b> 的责任和过程的接口.
 * 
 * @see InspironFactory
 * @see XpsFactory
 */
public interface DellFactory {
    Computer makeComputer();

    Cpu makeCpu();

    HardDrive makeHardDrive();
}
