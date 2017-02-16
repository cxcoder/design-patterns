package org.cx.abstractfactory;

public class Computer {
    private Cpu cpu;
    private HardDrive hardDrive;

    public Cpu getCpu() {
        return cpu;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

}
