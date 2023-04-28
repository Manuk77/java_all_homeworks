package org.all_homeworks.homeworks.exceptions.exercise9;

import java.util.Scanner;

public class Main {
    /**
     * this method throws an exception if second argument is less than 1,
     * and counts and prints if it's more than 0
     * @param num1
     * @param num2
     * @throws IllegalArgumentException
     */
    public void quotient(int num1, int num2) throws IllegalArgumentException{
        if(num2 < 1){
            throw new IllegalArgumentException("IllegalArgumentException: the second number must be more than 0");
        }
        int res = num1 % num2;
        System.out.println("quotient is equal to -> " + res);
    }

    public Main(){}

    public static void main(String[] args)throws Exception {

        Main main = new Main();
        Scanner scInt = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("ENTER FIRS NUMBER ");
            num1 = scInt.nextInt();

            System.out.print("ENTER SECOND NUMBER ");
            num2 = scInt.nextInt();
            main.quotient(num1, num2);

        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
