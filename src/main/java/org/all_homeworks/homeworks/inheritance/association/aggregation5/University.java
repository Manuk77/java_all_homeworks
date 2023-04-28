package org.all_homeworks.homeworks.inheritance.association.aggregation5;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> student;

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setStaff(List<Student> student) {
        this.student = student;
    }

    public List<String> getStaff(){

        List<String> students_fLName = new ArrayList<String>();
        for(Student student : this.student){
            students_fLName.add(student.getFirstName() + " " + student.getLastName());
        }
        return students_fLName;
    }

    public University(String name){
        this.name = name;
    }
    public University(){}
}
