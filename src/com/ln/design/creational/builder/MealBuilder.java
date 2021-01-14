package com.ln.design.creational.builder;

import com.ln.design.creational.builder.item.ChickenBurger;
import com.ln.design.creational.builder.item.Coke;
import com.ln.design.creational.builder.item.Pepsi;
import com.ln.design.creational.builder.item.VegBurger;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/8 15:48
 **/
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }




}
