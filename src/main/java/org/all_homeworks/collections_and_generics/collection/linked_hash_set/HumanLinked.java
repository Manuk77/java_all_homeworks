package org.all_homeworks.collections_and_generics.collection.linked_hash_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class HumanLinked implements Comparable<HumanLinked> {
    private String name;
    private int age;

    public HumanLinked(String name, int age) {
        if (nameCheck(name)){
            this.name = name;
            if (ageCheck(age))
                this.age = age;
        }
    }
    public HumanLinked () {}

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



    public static Comparator<HumanLinked> compareWithAge = new Comparator<HumanLinked>() {
        @Override
        public int compare(HumanLinked human1, HumanLinked human2) {
            return human1.getAge() - human2.getAge();
        }

    };

    public static Comparator<HumanLinked> comparatorWithName = new Comparator<HumanLinked>() {
        @Override
        public int compare(HumanLinked human1, HumanLinked human2) {
            return human1.getName().compareTo(human2.getName());
        }
    };


    @Override
    public int compareTo(HumanLinked o) {
        return this.getAge() - o.getAge();
    }

    public void print(TreeSet<HumanLinked> set) {
        for (HumanLinked hl: set) {
            System.out.println(hl);
        }
        System.out.println();
    }
    public void print(HashSet<HumanLinked> set) {
        for (HumanLinked hl: set) {
            System.out.println(hl);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "HumanLinked{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
