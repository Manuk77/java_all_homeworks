package org.all_homeworks.homeworks.methods;

import java.util.Scanner;

public class Methods {

    /**
     *
     * @param a
     * @param b
     * @return sum of a and b;
     */
    int func(int a, int b){
        return a + b;
    }

    /**
     * none;
     */
    void noneParametrs(){};

    /**
     *
     * @param a
     * @param b
     * returns nothing
     */
    void print(boolean a, boolean b){
        System.out.println("Hello world!");
    }

    /**
     *
     * @param s
     * @return input parametr
     */
    char foo(char s){
        return s;
    }

    /**
     *
     * @param a
     * @param b
     * @return one of the input parametrs
     */
    float fNum(float a, float b){
        if(a > b) return a;
        else return b;
    }

    /**
     *
     * @param n
     * @return n-th number of fibonaci
     */

    static int fib(int n){
        if (n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }

    }


    public static void main(String[] args){
        int n; int res = 0;
        Scanner sc = new Scanner(System.in);
        do{n = sc.nextInt();}
            while(n < 1);

        res = fib(n);
        System.out.println(" the -> " + n + " -th member of fib -> " + res);

    }
}
