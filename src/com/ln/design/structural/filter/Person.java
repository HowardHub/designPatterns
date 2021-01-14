package com.ln.design.structural.filter;

/**
 * @Description 待过滤的对象
 * @Author HeZhipeng
 * @Date 2021/1/11 11:03
 **/

public class Person {

    private String name;
    private String gender;
    private String maritalStatus; // 婚姻状况

    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getName() {
        return name;
    }


}
