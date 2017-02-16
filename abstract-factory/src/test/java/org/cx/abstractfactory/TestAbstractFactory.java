package org.cx.abstractfactory;

import static org.junit.Assert.assertTrue;

import org.cx.abstractfactory.Computer;
import org.cx.abstractfactory.Dell;
import org.cx.abstractfactory.InspironFactory;
import org.cx.abstractfactory.XpsFactory;
import org.junit.Test;

public class TestAbstractFactory {

    @Test
    public void testDellFactory() {
        Computer computer = Dell.createComputer(new XpsFactory());
        assertTrue("Intel".equals(computer.getCpu().name()));
        assertTrue("SSD".equals(computer.getHardDrive().name()));

        computer = Dell.createComputer(new InspironFactory());
        assertTrue("AMD".equals(computer.getCpu().name()));
        assertTrue("HDD".equals(computer.getHardDrive().name()));
    }

}
