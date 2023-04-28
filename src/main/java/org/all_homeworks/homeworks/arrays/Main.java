package org.all_homeworks.homeworks.arrays;

import java.util.Scanner;

public class Main {

    /**
     * prints positive values of array
     * @param array
     */
    public void printPosValues(int[] array){

        for(int i = 0; i < array.length; ++i){
            if(array[i] > 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * print array backwards
     * @param array
     */
    public void printBackwards(short[] array){

        for(int i = array.length - 1; i >= 0; --i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * prints max value of given array
     * @param arr
     */
    public void printMaxValue(long[] arr){

        long max = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max -> " + max);

    }

    /**
     * print min value of given array
     * @param arr
     */
    public void printMinValue(float[] arr){

        float min = arr[0];
        for(int i = 1; i <arr.length; ++i){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min -> " + min);
    }

    /**
     * moves given arrays values to second array
     * @param arr
     */
    public void copyArray(int[] arr){

        int[] arr3 = new int[arr.length];
        for(int i = 0; i < arr.length;  ++i){
            arr3[i] = arr[i];
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

    }

    /**
     * adds same index values to third array  |  vat anglerenis hamar naxapes nerexutyun em xndreum
     */
    public void addingSameIndexValues(){

        int[] arr = new int[]{15, 3, 4, 60};
        int[] arr1 = new int[]{17, 6, -1, 0};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr.length; ++i){
            arr2[i] = arr[i] + arr1[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }

    /**
     * counts count of given value in the array
     */
    public void countOfGivenValueInArray(){

        Scanner sc = new Scanner(System.in);
        int k;
        int count = 0;
        int[] arr = new int[]{1, 5, 3, 4, 5, 1, 2, 3, 5, 3, 5};
        System.out.print("enter the number -> ");
        k = sc.nextInt();
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println("count -> " + count);

    }

    /**
     * ex. 8
     * Write a method that prints all non-repeating triples into an array
     *
     */

    public int fact(int n){
        int res = 1;
        for(int i = 2; i <= n; ++i){
            res *= i;
        }
        return res;
    }

    public void nonRepetedSubList() {

        int[] arr = new int[]{1, 5, 6, 4, 3,};
        int count = 0;

        int[][] arr1 = new int[fact(arr.length) / (fact(arr.length - 3) * fact(3))][3];
        //System.out.println("arr1.lenght -> " + arr1.length);
        for (int i = 0; i < arr.length - 2; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    if (arr[i] != arr[j] && arr[i] != arr[k] && arr[j] != arr[k]) {
                        arr1[count][0] = arr[i];
                        arr1[count][1] = arr[j];
                        arr1[count][2] = arr[k];
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < arr1.length; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < arr1.length; ++i){
            bableSort(arr1[i]);
        }
        System.out.println("after sorted \n");

        for(int i = 0; i < arr1.length; ++i){
            for(int j = 0; j < arr1[i].length; ++j){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

    }

    /**
     * ex.9 continues ex. 8 sorts array regression
     * @param arr
     */
    public void bableSort(int[] arr){

        boolean isSorted;
        //int temp;

        for(int i = 0; i < arr.length - 1; ++i){
            isSorted = true;
            for(int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j + 1] > arr[j]){

                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j + 1] ^ arr[j];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
        /*for(int i = 0; i <arr.length; ++i){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();*/

    }

    /**
     * Arrange the terms of the given sequence of integers so that the odd ones are at the end
     * @param arr
     */
    public void evenValuesToLastPosition(int[] arr){

        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for(int j = 0; j < arr.length; ++j) {
            for (int i = count2; i < arr.length - count; ++i) {
                count1++;
                if ((arr[i] & 1) == 1 && (arr[arr.length - count - 1] & 1) == 1) {
                    count++;
                    break;
                } else if ((arr[i] & 1) == 1 && (arr[arr.length - count - 1] & 1) != 1) {
                    arr[arr.length - count - 1] = arr[arr.length - count - 1] ^ arr[i];
                    arr[i] = arr[arr.length - count - 1] ^ arr[i];
                    arr[arr.length - count - 1] = arr[arr.length - count - 1] ^ arr[i];
                    count++;
                    count2++;
                }else if((arr[i] & 1) == 0 && ((arr[arr.length - count - 1] & 1) == 0)){
                    count2++;
                }else if ((arr[i] & 1) == 0) {
                    count2++;
                    break;
                }else{
                    count2++;
                    count++;
                }

            }
        }
        System.out.println("count -> " + count1);
        for(int i = 0 ; i < arr.length; ++i){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

    }

    /**
     * ex. 11
     */
    public void escapeZeroes(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == 0){
                continue;
            }else {
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
    }


    /**
     * ex. 12
     */
    /*public void longestProgressCount(int[] arr){
        int count = 0;
        int [] x = new int[arr.length];

        for(int i = 0; i < x.length - count; ++i){
            int count1 = 0;
            int k = count;
            for(int j = k; j < arr.length - 1; ++j){

                if(arr[j] <= arr[j + 1]){
                    count++;
                    count1++;
                }
                else{
                    count++;
                    x[i] = count1;
                    break;
                }

            }

            System.out.print(x[i] + " \t");
        }

    }*/

    /**
     *ex.13 method pow()
     * @param num
     * @return
     */
    public int pow(int num){

        int res = 1;
        for(int i = 0; i < num; ++i){
            res *= 2;
        }
        return res;
    }

    /**
     * ex.13 from binary to int
     * this method calls pow() method
     * @param arr
     */
    public void binaryToInt(int[] arr){

        int num = 0;
        int count = arr.length - 1;
        for(int i = 0; i < arr.length; ++i){
            num += arr[i] * pow(count);
            count--;
        }
        System.out.println(num);

    }

    /**
     * ex.14
     * prints matrix upper main diagonaal
     * @param arr
     */
    public void upperMainDiagonal(int[][] arr){

        for(int i = 0; i < arr.length - 1; ++i){
            for(int j = i + 1; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * ex.15
     * swaps symmetric values of matrix
     * @param arr
     */
    public void swapSymmetric(int[][] arr){

        int count = 0;
        for(int i = 0; i < arr.length; ++i){
            for(int j = i + 1; j < arr[i].length; ++j){
                //count++;
                    arr[i][j] = arr[i][j] ^ arr[j][i];
                    arr[j][i] = arr[j][i] ^ arr[i][j];
                    arr[i][j] = arr[i][j] ^ arr[j][i];


            }
        }
        //System.out.println("count -> " + count + "\n");
        for(int i = 0; i < arr.length; ++i){
            for(int j = i + 1;  j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param arr
     * @return is odd the sum of row
     */
    public boolean isEven(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            sum += arr[i];
        }
        return ((sum & 1) == 0);
    }

    /**
     * ex.16 this method calls isOdd()
     * @param arr
     * @return if sum of evry row is odd
     */
    public boolean sumOfMatrixRowsISEven(int[][] arr){

        //int sum;
        boolean[] array = new boolean[arr.length];
        for(int i = 0 ; i < arr.length; ++i){
            if(!isEven(arr[i])){
                return false;
            }

        }

        return true;

    }



    public static void main(String[] args){

        Main ob = new Main();

        int[] array = new int[]{-1, -2, 0, 3, -4, 2, 45, 0, -78};
        short[] arr = new short[]{7, 8, 9, 12, 0};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 0, 7, 8, 9};
        long[] list = new long[]{15, 20, 11, 32, 17, 0, -5};

        float[] arr1 = new float[]{12.1F, 14.0F, 15.3F, 0.0F, -14.6F};
        int[] arr3 = new int[]{1, 1, 1, 0, 0, 1, 1};
        int[][] arrTwoD = new int[][]{

                {1, 2, 3, 4},
                {5, 3, 4, 6},
                {4, 5, 0, 3},
                {7, 5, 6, 3}
        };
        int[][] arrTwo = new int[][]{
                {1, -1, 0, 0},
                {2, -2, 1, -1},
                {9, 7, 1, -17}
        };

        int[] x = new int[]{4, 5, 6, 8, 7, 9, 5, 4, 9, 7, 1, 6};
        //ob.printPosValues(array);
        //ob.printBackwards(arr);
        //ob.printMaxValue(list);
        //ob.printMinValue(arr1);

        //ob.copyArray(arr2);
        //ob.addingSameIndexValues();
        //ob.countOfGivenValueInArray();
        //ob.nonRepetedSubList();
        //ob.evenValuesToLastPosition(x);
        //ob.binaryToInt(arr3);
        //ob.upperMainDiagonal(arrTwoD);
        ob.swapSymmetric(arrTwoD);
        //System.out.println(ob.sumOfMatrixRowsISOdd(arrTwo));
        //ob.longestProgressCount(x);
        //ob.escapeZeroes(array);

        String str = new String();
    }
}
