package com.ln.design.behavioral.iterator;

import org.omg.CORBA.Object;

import java.util.Objects;

/**
 * @Description TODO
 * @Author HeZhipeng
 * @Date 2021/1/13 11:38
 **/
public class NameContainer<T> implements Container {

    private T[] names;
    private int size = 0;


    public NameContainer(){
        names = (T[]) new Object[10];
    }

    public void add(T item){
        names[size++] = item;
    }


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator{

        private int index;


        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return names[index++];
        }
    }
}
