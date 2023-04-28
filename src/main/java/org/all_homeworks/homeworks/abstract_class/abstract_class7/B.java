package org.all_homeworks.homeworks.abstract_class.abstract_class7;

import java.util.ArrayList;
import java.util.List;

public class B extends Mark{
    private int math;
    private int chemistry;
    private int physics;
    private int geography;

    public void setMath(int math) {
        if(math > 0 && math < 101){
            this.math = math;
        }
    }
    public int getMath(){
        return this.math;
    }

    public void setChemistry(int chemistry) {
        if(chemistry > 0 && chemistry < 101){
            this.chemistry = chemistry;
        }
    }
    public int getChemistry(){
        return this.chemistry;
    }

    public void setPhysics(int physics){
        if(physics > 0 && physics < 101){
            this.physics = physics;
        }
    }
    public int getPhysics() {

        return physics;
    }
    public void setGeography(int geography){
        if(geography > 0 && geography < 101){
            this.geography = geography;
        }
    }

    public List<Integer> getPercentage(){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(math);
        integerList.add(chemistry);
        integerList.add(geography);
        integerList.add(physics);
        return integerList;
    }

    public B (int math, int chemistry, int geography, int physics){
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.geography = geography;
    }

}
