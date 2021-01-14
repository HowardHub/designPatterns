package com.ln.design.behavioral.visitor;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 17:53
 **/
public interface ComputerPart {


    void accept(ComputerPartVisitor computerPartVisitor);
}
