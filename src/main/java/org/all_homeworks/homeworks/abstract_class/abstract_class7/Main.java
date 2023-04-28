package org.all_homeworks.homeworks.abstract_class.abstract_class7;

public class Main {
    public static void main(String[] args) {
        B b = new B (75, 65, 100, 89);
        A a = new A ( 85, 61, 100);
        System.out.println(b.getPercentage());
        System.out.println(a.getPercentage());
    }
}
