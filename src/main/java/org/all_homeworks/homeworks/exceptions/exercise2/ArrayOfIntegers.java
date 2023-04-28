package org.all_homeworks.homeworks.exceptions.exercise2;


import java.util.Scanner;

public class ArrayOfIntegers {
    private int[] arr = new int[10];

    /**
     * this method sets the given array of integers to the instance one
     * @param arr
     * @throws RuntimeException
     */
    public void setArr(int[] arr) throws RuntimeException{
        if(arr.length != 0){
            for(int i = 0; i < arr.length; ++i){
                this.arr[i] = arr[i];
            }
        }else{
            throw new RuntimeException("the given arr has not initialized");
        }
    }

    /**
     * with this method we can get the array
     * @return
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * this method counts the sum of array values which should be og type integer
     * if it's not it throws exception
     * @return
     * @throws Exception
     */
    public int sumOfArrayValues() throws Exception{
        Scanner scInt = new Scanner(System.in);
        int sum  = 0;
        for(int i = 0; i < this.arr.length; ++i){
            try{
                System.out.print("ENTER THE " + (i + 1) + "-st ELEMENT ");
                this.arr[i] = scInt.nextInt();
            }catch (Exception ex){
                System.out.println("InputMismatchException: the input value has to be of type integer");
                return -1;
            }
            sum += arr[i];
        }
        return sum;
    }

    public ArrayOfIntegers(){}
}
