package org.all_homeworks.homeworks.inheritance.association.aggregation5;

public class Human {
    private String name;

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public Human(String name){
        this.name = name;
    }
    public Human(){}
}
