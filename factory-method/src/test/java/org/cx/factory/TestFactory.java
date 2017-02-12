package org.cx.factory;

import static org.junit.Assert.assertTrue;

import org.cx.factory.Computer;
import org.cx.factory.Creator;
import org.cx.factory.InspironCreator;
import org.cx.factory.XpsCreator;
import org.junit.Test;

public class TestFactory {

    @Test
    public void testMazeGame() {
        Creator creator = new XpsCreator();

        Computer computer = creator.create();
        assertTrue("Intel".equals(computer.getCpu().name()));
        assertTrue("SSD".equals(computer.getHardDrive().name()));

        creator = new InspironCreator();
        computer = creator.create();
        assertTrue("AMD".equals(computer.getCpu().name()));
        assertTrue("HDD".equals(computer.getHardDrive().name()));
    }
}
