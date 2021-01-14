package com.ln.design.structural.composite;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 14:49
 **/
public class CompositePatternDemo {


    public static void main(String[] args){

        Employee CEO = new Employee("Bob", "CEO", 300000);

        Employee marketManger = new Employee("Jack", "Manager", 400000);

        Employee headSales = new Employee("Howard", "Sales", 900000);


        Employee market1 = new Employee("market1", "Market", 20000);
        Employee market2 = new Employee("market2", "Market", 30000);

        Employee sales1 = new Employee("sales1", "Sales", 50101);
        Employee sales2 = new Employee("sales2", "Sales", 50000);

        CEO.add(marketManger);
        CEO.add(headSales);

        marketManger.add(market1);
        marketManger.add(market2);

        headSales.add(sales1);
        headSales.add(sales2);


        for (Employee subordinate : CEO.getSubordinates()) {
            System.out.println(subordinate);
            for (Employee subordinateSubordinate : subordinate.getSubordinates()) {
                System.out.println(subordinateSubordinate);
            }
        }

    }

}
