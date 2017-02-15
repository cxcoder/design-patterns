package org.cx.factory;

/**
 * 声明工厂方法，并返回一个产品类的对象.
 * 
 * @see Computer
 * @see XpsCreator
 * @see InspironCreator
 */
public abstract class Creator {
    
    /**
     * 模板方法，定义创建和组装 Computer 对象的步骤
     */
    public Computer create() {
        Computer computer = createComputer();
        Cpu cpu = makeCpu();
        HardDrive hardDrive = makeHardDrive();
        computer.setCpu(cpu);
        computer.setHardDrive(hardDrive);
        return computer;
    }

    /**
     * 工厂方法，创建一个 Computer 对象
     * 
     * <p>子类可重写，也可以使用默认实现
     */
    protected Computer createComputer() {
        return new Computer();
    }

    /**
     * 工厂方法，创建一个 Computer 的组件对象，由子类决定如何实现.
     */
    protected abstract Cpu makeCpu();

    protected abstract HardDrive makeHardDrive();
}
