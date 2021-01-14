package com.ln.design.creational.builder;

import com.ln.design.creational.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:46
 **/
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (int i = 0; i < items.size(); i++) {
            cost += items.get(i).price();
        }
        return cost;
    }


    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
