package org.all_homeworks.homeworks.interface_.interface4;

public class Arithmetic implements Test{
    @Override
    public int  square(int num) {
        System.out.println("Arithmetic square() method");
        return num * num;
    }
    public Arithmetic(){}
}
