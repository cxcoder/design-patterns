package org.cx.templatemethod;

import org.cx.templatemethod.Application;
import org.cx.templatemethod.MyApplication;
import org.junit.Assert;
import org.junit.Test;

public class TestApplication {

    @Test
    public void testOpenDocument() {
        Application app = new MyApplication();
        Assert.assertTrue(app.openDocument());
    }
}
