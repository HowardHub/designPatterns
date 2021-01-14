package com.ln.design.behavioral.iterator;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/13 11:40
 **/
public class IteratorPatternDemo {



    public static void main(String[] args){

        NameContainer<String> container = new NameContainer<>();

        container.add("a");
        container.add("b");
        container.add("c");

        Iterator iterator = container.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }




}
