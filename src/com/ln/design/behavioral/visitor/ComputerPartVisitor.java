package com.ln.design.behavioral.visitor;


/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 17:54
 **/
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
