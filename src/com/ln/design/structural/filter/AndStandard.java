package com.ln.design.structural.filter;

import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 11:09
 **/
public class AndStandard implements Standard{


    private Standard standard;

    private Standard otherStandard;

    public AndStandard(Standard standard, Standard otherStandard) {
        this.standard = standard;
        this.otherStandard = otherStandard;
    }


    @Override
    public List<Person> meetStandard(List<Person> list) {
        List<Person> firstFilterRes = this.standard.meetStandard(list);
        return otherStandard.meetStandard(firstFilterRes);
    }





}
