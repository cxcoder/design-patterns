package org.cx.builder;

import java.util.Map;
import java.util.Map.Entry;

/**
 * Director
 * 
 * <p>DataParser 数据解析器，将 key-value 转换为多种正文格式
 * 
 * @see XmlText
 * @see JsonText
 * @see TextConverter
 */
public class DataParser {

    private TextConverter converter;
    
    public DataParser(TextConverter converter) {
        this.converter = converter;
    }

    /**
     * 创建复杂对象的转换算法
     */
    public void parse(Map<String, Object> data) {
        for (Entry<String, Object> en : data.entrySet()) {
            if (Integer.class.isInstance(en.getValue())) {
                converter.convertInteger(en.getKey(), en.getValue());
            } else if (String.class.isInstance(en.getValue())) {
                converter.convertString(en.getKey(), en.getValue());
            }
        }
    }
}
