package com.ln.design.behavioral.visitor;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:54
 **/
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
