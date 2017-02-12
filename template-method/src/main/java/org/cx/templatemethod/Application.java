package org.cx.templatemethod;

public abstract class Application {

    /**
     * 模板方法，定义打开一个文档的主要步骤
     */
    public boolean openDocument() {
        if (!canOpenDocument()) {
            return false;
        }

        Document doc = doCreateDocument();
        if (doc != null) {
            aboutToOpenDocument(doc);
            doc.open();
            return doc.doRead();
        }
        return true;
    }

    /**
     * 工厂方法，创建与应用相关的 Document 对象.
     */
    protected abstract Document doCreateDocument();

    protected abstract boolean canOpenDocument();

    /**
     * 打开文档之前被调用，钩子操作，默认什么都不做，子类可重写.
     */
    protected void aboutToOpenDocument(Document doc) {
    }

}