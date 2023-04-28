package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_3;

public class Main {
    public static void main(String[] args) {
        for(Planet planet : Planet.values()){
            System.out.println(planet.printNameMassPlanet());
        }
    }
}
