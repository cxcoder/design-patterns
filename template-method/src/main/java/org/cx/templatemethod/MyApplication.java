package org.cx.templatemethod;

public class MyApplication extends Application {

    @Override
    protected Document doCreateDocument() {
        return new MyDocument();
    }

    @Override
    protected boolean canOpenDocument() {
        return true;
    }

}
