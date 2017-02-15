package org.cx.builder;

/**
 * Director
 * <br>
 * RTF(Rich Text Format) 富文本格式，由未格式化文本、控制字、控制符号和组组成
 * ， 标准的RTF文件应该仅包含7位ASCII码字符
 * 
 * <p>RTFReader 阅读器，能将 RTF 转换为多种正文格式
 * 
 * @see ASCIIText
 * @see TeXText
 * @see TextConverter
 */
public class RTFReader {

    private TextConverter converter;
    
    public RTFReader(TextConverter converter) {
        this.converter = converter;
    }

    /**
     * 创建复杂对象的转换算法
     */
    public void parseRTF() {
        converter.convertCharacter();
    }
}
