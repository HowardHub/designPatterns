package com.ln.design.j2ee.mvc;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:21
 **/
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }


}
