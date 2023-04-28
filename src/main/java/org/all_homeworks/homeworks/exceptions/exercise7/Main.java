package org.all_homeworks.homeworks.exceptions.exercise7;

import java.util.Scanner;

public class Main {

    /**
     * this method prints the age if it's in (0, 120] range,
     * if it's not it will throw an exception
     * @param age
     * @throws IllegalArgumentException
     */
    public void age(int age) throws IllegalArgumentException{
        if(age <= 0 || age > 120){
            throw new IllegalArgumentException("IllegalArgumentException: the age has to be in (0, 120] range");
        }
        System.out.println(age);
    }
    public Main(){}



    public static void main(String[] args) throws Exception{
        Main main = new Main();
        try {
            Scanner scInt = new Scanner(System.in);
            System.out.print("ENTER THE AGE ");
            int age = scInt.nextInt();
            main.age(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
