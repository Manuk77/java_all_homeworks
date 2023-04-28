package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_2;

public class Main {
    public static void main(String[] args) {
        for(CoffeeSize coffeeSize: CoffeeSize.values()){
            System.out.println("coffee size -> " + coffeeSize.toString() + " ordinal -> " + coffeeSize.ordinal());
        }

    }
}
