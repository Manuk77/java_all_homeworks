package org.all_homeworks.collections_and_generics.collection.set_map;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Human implements Comparable<Human> {

    private String name;
    private int age;

    public Human(String name, int age) {
        if (nameCheck(name)){
            this.name = name;
            if (ageCheck(age))
                this.age = age;
        }
    }
    public Human () {}

    public void setAge(int age) {
        if (ageCheck(age)) {
           this.age = age;
        }
        throw new IllegalArgumentException("specified age must be in [0,100] range");
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (nameCheck(name)){
            if (!name.isEmpty()){
                this.name = name;
                return;
            }
            throw new IllegalStateException("the specified string must not be empty");
        }
        throw new NullPointerException("the specified string must not be null");

    }

    public String getName() {
        return name;
    }

    private boolean ageCheck(int age) {
        return age > 0 && age < 101;
    }

    private boolean nameCheck(String name) {
        return name != null;
    }



    public static Comparator<Human> compareWithAge = new Comparator<Human>() {
        @Override
        public int compare(Human human1, Human human2) {
            return human1.getAge() - human2.getAge();
        }

    };

    public static Comparator<Human> comparatorWithName = new Comparator<Human>() {
        @Override
        public int compare(Human human1, Human human2) {
            return human1.getName().compareTo(human2.getName());
        }
    };


    @Override
    public int compareTo(Human o) {
        return this.getAge() - o.getAge();
    }

    public void printF(TreeSet<Human> set) {
        for (Human h: set) {
            System.out.println(h);
        }
    }

    public void print(HashSet<Human> set) {
        for (Human h: set) {
            System.out.println(h);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                '}';
    }
}
