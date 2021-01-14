package com.ln.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 14:26
 **/
public class Employee {

    private String name;
    private String dept;
    private int salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }


    public void add(Employee employee) {
        this.subordinates.add(employee);
    }

    public void remove(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }

}
