package org.all_homeworks.homeworks.algorithm.algorithm1;
import java.util.Random;

public class Algorithm {

    /**
     * 1. Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
     * write a method that returns true if it is possible to make a package with goal kilos of rice.
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public boolean canMakePackage(int small, int big, int goal) {

        int maxBig = goal / 5;
        int remaining = goal % 5;

        if (big >= maxBig && small >= remaining) {

                return true;

        } else if (small >= goal - (big * 5)) {
            return true;
        }
        return false;
    }

    /**
     * 2. The prime factors of 455 are 5, 7 and 13.
     * Write a method that calculates the largest prime factor of a given number.
     * @param number
     * @return
     */
    public  int largestPrimeFactors(int number) {
        int i;
        int largestFactor = 1;

        for (i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        if (number > largestFactor) {
            largestFactor = number;
        }

        return largestFactor;
    }

    /**
     * 3. Write a program that generates a random number between 1 and 100
     *          you can use the Random ( ) method from the Math class.
     *          the next step check whether it is an even or an odd number.
     *         Each of the above actions should be written to the console.
     */
    public void randomGenerate(){
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        String result = ((num & 1) == 0)? " even ": " odd ";
        System.out.println("number " + num + " is " + result + "\n");
    }

    /**
     *  4. Write a program that will use the while loop to find the largest and smallest number from
     *     the set of 10 randomly drawn integers from 1 to 100. In this task, do not use arrays or other collections.
     *     import java.util.Random;
     */

    public void randomMaxMin(){

        Random random = new Random();
        int count = 10;
        int max = 1;
        int min = 100;
        int num = 0;

        while(count > 0){
            
            num = random.nextInt(100) + 1;
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            --count;

        }
        System.out.println("min = " + min + " \n");
        System.out.println("max = " + max + " \n");


    }

    public static void main(String[] args){

        Algorithm ob = new Algorithm();
        System.out.println(ob.canMakePackage(6, 5, 31) + "\n");
        System.out.println(ob.largestPrimeFactors(75) + "\n");
        //ob.randomGenerate();
        //ob.randomMaxMin();


    }
}
