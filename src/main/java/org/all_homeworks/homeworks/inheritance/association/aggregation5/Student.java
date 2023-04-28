package org.all_homeworks.homeworks.inheritance.association.aggregation5;

public class Student {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.isEmpty()){
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        if(lastName != null && !lastName.isEmpty()){
            this.lastName = lastName;
        }
    }
    public String getLastName(){
        return this.lastName;
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){}

}
