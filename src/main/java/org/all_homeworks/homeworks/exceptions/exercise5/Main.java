package org.all_homeworks.homeworks.exceptions.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        Scanner scInt = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER ");
        int number = scInt.nextInt();
        System.out.println(squareRoot.squareRoot(number));
    }
}
