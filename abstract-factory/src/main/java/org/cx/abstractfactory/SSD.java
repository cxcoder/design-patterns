package org.cx.abstractfactory;

public class SSD implements HardDrive {
    @Override
    public String name() {
        return "SSD";
    }
}
