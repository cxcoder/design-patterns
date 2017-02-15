package org.cx.builder;

/**
 * Builder
 * <p>
 * 为创建一个 Product 对象的各个部件指定抽象接口
 * 
 * @see TeXConverter
 * @see ASCIIConverter
 */
public abstract class TextConverter {

    protected abstract void convertCharacter();

    protected abstract void convertFontChange();

    protected abstract void convertParagraph();

}
