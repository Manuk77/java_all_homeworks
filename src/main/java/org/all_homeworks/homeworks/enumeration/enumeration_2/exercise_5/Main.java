package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temperature;
        System.out.print("Enter a temperature: ");
        temperature = sc.nextInt();
        for(Season season : Season.values()){
            System.out.println(season.whichSeasonIs(temperature));

        }


    }
}
