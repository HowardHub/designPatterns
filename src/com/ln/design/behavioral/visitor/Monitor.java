package com.ln.design.behavioral.visitor;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:55
 **/
public class Monitor implements ComputerPart {


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}