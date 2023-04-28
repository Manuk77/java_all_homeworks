package org.all_homeworks.homeworks.exceptions.exercise6;

import java.util.Scanner;

public class Main {
    /**
     * this method trows exception which was created from us.
     * if the entered number is not in range from 0 to 2 ([0, 2) it trows IllegalArgumentException
     * @throws MyExceptionOne
     * @throws MyExceptionSecond
     * @throws MyExceptionThird
     * @throws IllegalArgumentException
     */
    public void myExceptions() throws MyExceptionOne, MyExceptionSecond, MyExceptionThird , IllegalArgumentException{
        Scanner scInt = new Scanner(System.in);
        int choice;
        System.out.print("ENTER NUMBER [0, 2] RANGE  ");
        choice = scInt.nextInt();
        if(choice >= 0 && choice < 3){
            switch (choice){
                case 0:
                    throw  new MyExceptionOne("FIRS EXCEPTION ");
                case 1:
                    throw new MyExceptionSecond("SECOND EXCEPTION ");
                case 2:
                    throw new MyExceptionThird("THIRD EXCEPTION ");
            }
        }else{
            throw new IllegalArgumentException("IllegalArgumentException: ENTERED VALUE MUST BE IN RANGE [0, 2]");
        }


    }
    public static void main(String[] args)throws MyExceptionOne, MyExceptionSecond, MyExceptionThird , IllegalArgumentException{
        Main obj = new Main();
        try {
            obj.myExceptions();
        }catch (MyExceptionOne | MyExceptionSecond | MyExceptionThird e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
