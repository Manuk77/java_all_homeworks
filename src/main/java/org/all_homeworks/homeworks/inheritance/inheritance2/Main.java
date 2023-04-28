package org.all_homeworks.homeworks.inheritance.inheritance2;



public class Main {
    public Main(){}

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println(obj.message);
        System.out.println(((SuperClass)obj).message);

    }
}
