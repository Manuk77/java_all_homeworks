package org.all_homeworks.homeworks.inheritance.association.aggregation5;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    List<Human> staff;

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setStaff(List<Human> staff){
        this.staff = staff;
    }

    public List<String> getStaff(){
        List<String> staff = new ArrayList<String>();
        for(Human human : this.staff){
            staff.add(human.getName());
        }
        return staff;
    }

    public Building(String name){
        this.name = name;
    }
    public Building(){}

}
