package com.ln.design.behavioral.visitor;

/**
 * @Description 我们将创建一个定义接受操作的 ComputerPart 接口。
 * Keyboard、Mouse、Monitor 和 Computer 是实现了 ComputerPart 接口的实体类。
 * 我们将定义另一个接口 ComputerPartVisitor，它定义了访问者类的操作。
 * Computer 使用实体访问者来执行相应的动作。
 * VisitorPatternDemo，我们的演示类使用 Computer、ComputerPartVisitor 类来演示访问者模式的用法。
 * @Author HeZhipeng
 * @Date 2021/1/13 17:55
 **/
public class VisitorPatternDemo {


    public static void main(String[] args){

        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());


    }




}
