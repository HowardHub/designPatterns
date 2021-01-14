package com.ln.design.j2ee.mvc;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Description
 * @Author HeZhipeng
 * @Date 2021/1/14 10:21
 **/
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }



    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }


}
