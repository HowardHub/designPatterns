package com.ln.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/11 11:28
 **/
public class FilterPatternDemo {

    public static void main(String[] args){

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        System.out.println("Males:");
        Standard males = new StandardMale();
        printPersons(males.meetStandard(persons));

        System.out.println("Females:");
        Standard females = new StandardFemale();
        printPersons(females.meetStandard(persons));

        System.out.println("Singles:");
        Standard singles = new StandardSingle();
        printPersons(singles.meetStandard(persons));

        System.out.println("Single and male");
        Standard singleAndMales = new AndStandard(new StandardSingle(), new StandardMale());
        printPersons(singleAndMales.meetStandard(persons));

        System.out.println("Single or Female");
        Standard singleOrFemales = new AndStandard(new StandardSingle(), new StandardFemale());
        printPersons(singleOrFemales.meetStandard(persons));




    }





    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
