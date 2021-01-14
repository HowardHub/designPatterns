package com.ln.design.structural.filter;

import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 11:09
 **/
public class OrStandard implements Standard{

    private Standard standard;

    private Standard otherStandard;

    public OrStandard(Standard standard, Standard otherStandard) {
        this.standard = standard;
        this.otherStandard = otherStandard;
    }




    @Override
    public List<Person> meetStandard(List<Person> list) {
        List<Person> firstFilterRes = standard.meetStandard(list);
        List<Person> otherFilterRes = otherStandard.meetStandard(list);
        for (Person person : otherFilterRes) {
            if (!firstFilterRes.contains(person)) {
                firstFilterRes.add(person);
            }
        }
        return firstFilterRes;
    }



}
