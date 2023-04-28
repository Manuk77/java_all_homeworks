package org.all_homeworks.homeworks.inheritance.inheritance1;

/**
 * ex.1
 * this class inherits from Parent class and has one override method
 */
public class Child extends Parent {
    @Override
    public void showMessage() {
        System.out.println("hello child class");
    }
    public Child(){super.showMessage();}
}
