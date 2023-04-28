package org.all_homeworks.homeworks.exceptions.exercise11;

import java.util.Scanner;

public class Main {
    /**
     * this method throws exception if the given string is null or empty,
     * if it's not it reverses the given string
     * @param str
     * @return reverse str
     * @throws Exception
     */
    public String reverseString(String str) throws NullPointerException, IllegalArgumentException{
        if(str == null){
            throw new NullPointerException("the given string has no reference to the object, it's null ");
        }else if(str.isEmpty()){
            throw new IllegalArgumentException("the given string is empty");
        }else{
            StringBuilder stringBuilder = new StringBuilder(str);
            return str = stringBuilder.reverse().toString();
        }
    }

    public Main(){}


    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Scanner scStr = new Scanner(System.in);
        System.out.print("ENTER THE STRING ");
        String str = scStr.nextLine();
        try {
            System.out.println(main.reverseString(str));
        }catch (NullPointerException nE){
            System.out.println("NullPointerException: " + nE.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException " + e.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
