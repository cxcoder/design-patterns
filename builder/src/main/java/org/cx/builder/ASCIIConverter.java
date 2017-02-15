package org.cx.builder;

/**
 * ConcreteBuilder
 * <p>
 * 构造和装配 ASCII 纯文本格式的各个部件，只负责转换普通文本
 * 
 * @see ASCIIText
 */
public class ASCIIConverter extends TextConverter {

    @Override
    protected void convertCharacter() {

    }

    @Override
    protected void convertFontChange() {
    }

    @Override
    protected void convertParagraph() {
    }

}
