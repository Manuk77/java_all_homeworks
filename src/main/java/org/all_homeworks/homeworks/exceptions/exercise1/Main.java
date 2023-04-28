package org.all_homeworks.homeworks.exceptions.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Reciprocal reciprocal = new Reciprocal();
        System.out.print("ENTER THE NUMBER ");
        int number = scInt.nextInt();
        reciprocal.reciprocal(number);
    }
}
