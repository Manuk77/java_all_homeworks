package org.all_homeworks.homeworks.abstract_class.abstract_class7;

import java.util.ArrayList;
import java.util.List;

public class A extends Mark{
    private int math;
    private int chemistry;
    private int physics;

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
        return this.physics;
    }

    public List<Integer> getPercentage(){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(math);
        integerList.add(physics);
        integerList.add(chemistry);

        return integerList;
    }

    public A(int math, int physics, int chemistry){
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
    }

}
