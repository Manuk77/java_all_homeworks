package org.all_homeworks.classes_for_testing;

public class Methods {
    /**
     *
     * @param a
     * @param b
     * @return sum of a and b;
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * none;
     */
    public void noneParameters(){};

    /**
     *
     * @param a
     * @param b
     * returns nothing
     */
    public String print(boolean a, boolean b){
        System.out.println("Hello world!");
        return "Hello world!";
    }

    /**
     *
     * @param s
     * @return input parametr
     */
    public char foo(char s){
        return s;
    }

    /**
     *
     * @param a
     * @param b
     * @return one of the input parametrs
     */
    public float fNum(float a, float b){
        if(a > b) return a;
        else return b;
    }

    /**
     *
     * @param n
     * @return n-th number of fibonaci
     */

    public int fib(int n){
        if (n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }

    }

}
