package org.cx.builder;

/**
 * ConcreteBuilder
 * 
 * <p>构造和装配 Xml 格式的各个元素
 * 
 * @see XmlText
 */
public class XmlConverter extends TextConverter {

    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<content>";
    
    @Override
    protected void convertString(String key, Object value) {
        xml += "<" + key + ">" + value + "</" + key + ">";
    }

    @Override
    protected void convertInteger(String key, Object value) {
        convertString(key, value);
    }
    
    public XmlText getResult() {
        xml += "</content>";
        return new XmlText(xml);
    }

}
