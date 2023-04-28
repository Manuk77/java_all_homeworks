package org.all_homeworks.homeworks.abstract_class.abstract_class2;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("this is Circle's draw() method");
    }
    @Override
    public void erase(){
        System.out.println("this is Circle's erase() method");
    }
}
