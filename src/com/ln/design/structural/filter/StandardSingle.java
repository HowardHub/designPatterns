package com.ln.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 11:14
 **/
public class StandardSingle implements Standard {




    @Override
    public List<Person> meetStandard(List<Person> list) {
        List<Person> res = new ArrayList<>();
        for (Person person : list) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                res.add(person);
            }
        }
        return res;
    }




}
