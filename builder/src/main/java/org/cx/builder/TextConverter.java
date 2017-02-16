package org.cx.builder;

/**
 * Builder
 * 
 * <p>为创建一个 Product 对象的各个部件指定抽象接口
 * 
 * @see JsonConverter
 * @see XmlConverter
 */
public abstract class TextConverter {

    protected abstract void convertString(String key, Object value);

    protected abstract void convertInteger(String key, Object value);

}
