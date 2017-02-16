package org.cx.builder;

/**
 * ConcreteBuilder
 * 
 * <p>构造和装配 Json 格式各种类型的元素
 * 
 * @see JsonText
 */
public class JsonConverter extends TextConverter {
    
    private String json = "{";
    
    @Override
    protected void convertString(String key, Object value) {
        json += "\"" + key + "\":\"" + value + "\", ";
    }

    @Override
    protected void convertInteger(String key, Object value) {
        json += "\"" + key + "\":" + value + ", ";
    }
    
    public JsonText getResult() {
        json = json.substring(0, json.lastIndexOf(","));
        json += "}";
        return new JsonText(json);
    }

}
