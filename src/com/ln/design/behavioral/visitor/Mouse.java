package com.ln.design.behavioral.visitor;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:55
 **/
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
