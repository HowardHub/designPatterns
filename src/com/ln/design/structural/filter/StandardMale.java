package com.ln.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 11:10
 **/
public class StandardMale implements Standard{


    @Override
    public List<Person> meetStandard(List<Person> list) {
       List<Person> res = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                res.add(person);
            }
        }
        return res;
    }
}
