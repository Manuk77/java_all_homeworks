package org.all_homeworks.homeworks.exceptions.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        DividedByZero obj = new DividedByZero();
        System.out.print("ENTER FIRST NUMBER ");
        int firstNumber = scInt.nextInt();
        System.out.print("ENTER SECOND NUMBER ");
        int secondNumber = scInt.nextInt();
        System.out.println(obj.dividedByZero(firstNumber, secondNumber));

    }
}
