package org.cx.abstractfactory;

/**
 * 客户端
 */
public class Dell {
    public static Computer createComputer(DellFactory dellFactory) {
        Computer computer = dellFactory.makeComputer();
        Cpu cpu = dellFactory.makeCpu();
        HardDrive hardDrive = dellFactory.makeHardDrive();

        computer.setCpu(cpu);
        computer.setHardDrive(hardDrive);
        return computer;
    }
}
