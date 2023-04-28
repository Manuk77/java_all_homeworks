package org.all_homeworks.homeworks.abstract_class.class5;

public class Parent {
    static{
        System.out.println("Parent class");
    }
    public static int num;

    public int print(){
        return num;
    }

    public int changeTheStaticField(int i){
        return num = i;
    }

    public Parent(int num){
        this.num = num;
    }
    public Parent(){}
}
