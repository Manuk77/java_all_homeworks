package org.all_homeworks.homeworks.algorithm.algorithm2;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static {
        System.out.println("main class \n");
    }

    /**
     * Write a program that prompts the user to input a positive integer.
     * It should then print the multiplication table of that number.
     */
    public void multiplicationTable(){

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter a positive integer -> " + (num = sc.nextInt()));
        //sc.close();

        for(int i = 1; i < 11; ++i){
            System.out.println(num + " x " + i + " = " + (i * num));
        }

    }

    /**
     * Two numbers are entered through the keyboard. Write a program to find the value of
     * one number raised to the power of another.(Do not use Java built-in method)
     */

    public void exp(){
        Scanner sc = new Scanner(System.in);
        int base;
        int exp;
        int res  = 1;
        System.out.println("enter a base -> " + (base = sc.nextInt()));
        System.out.println("enter a exp -> " + (exp = sc.nextInt()));
        for(int i = 0; i < exp; ++i){
            res *= base;
        }
        System.out.println("res  = " + res + "\n");

    }

    /**
     * Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
     * For example, if the input is 12345, the output should be 54321.
     */
    public void reversNum(){

        Scanner sc = new Scanner(System.in);
        int num;
        int revers = 0;
        System.out.println("enter num -> " + (num = sc.nextInt()));

        while(num != 0){
            revers = revers * 10 + num % 10;
            num /= 10;

        }
        System.out.println("revers -> " + revers + "\n");
    }

    /**
     * Write a program that prompts the user to input a positive integer.
     * It should then output a message indicating whether the number is a prime number
     * @return
     */
    public boolean isPrime(){

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter num -> " + (num = sc.nextInt()));

        if(num > 1){
            for(int i = 2; i < (num / i); ++i){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    /**
     * Write a do-while loop that asks the user to enter two numbers.
     * The numbers should be added and the sum displayed.
     * The loop should ask the user whether he or she wishes to perform the operation again.
     * If so, the loop should repeat; otherwise it should terminate.
     */
    public void choice(){
        Scanner sc = new Scanner(System.in);

        String choice;
        int num1;
        int num2;

        do {

            System.out.println("enter the first num -> " + (num1 = sc.nextInt()));
            System.out.println("enter the second num -> " + (num2 = sc.nextInt()));

            int sum = num1 + num2;
            System.out.println("sum is -> " + sum);

            System.out.println("do you want to continue (y/n) ");
            choice = sc.next();

        }while(choice.equals("y"));



    }

    public void posNegZeroCount(){

        Scanner sc  = new Scanner(System.in);
        String choice;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int num;

        do{
            System.out.println("enter the  num -> " + (num = sc.nextInt()));
            if(num > 0){
                positiveCount++;
            }else if(num < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
            System.out.println("do you want to continue (y/n) ");
            choice = sc.next();

        }while(choice.equals("y"));

        System.out.println("positiveCount -> " + positiveCount);
        System.out.println("negativeCount -> " + negativeCount);
        System.out.println("zeroCount     -> " + zeroCount);

    }

    /**
     * Write a program to enter the numbers till the user wants and at the end the
     * program should display the largest and smallest numbers entered
     */
    public void maxMinValues(){

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num;
        String choice;

        do{

            System.out.println("enter the number -> " + (num = sc.nextInt()));
            if(num > max){ max = num; }
            if(num < min){ min = num; }
            System.out.println("do you want to continue (y/n) ");
            choice = sc.next();

        }while(choice.equals("y"));

        System.out.println("max -> " + max);
        System.out.println("min -> " + min);


    }

    /**
     * Write a program to print out all Armstrong numbers between 1 and 500.
     * If sum of cubes of each digit of the number is equal to the number itself,
     * then the number is called an Armstrong number
     */
    public void armstrongNumbers(){

        for(int i = 2; i < 501; ++i){

            int num = i;
            int sum = 0;

            while(num != 0){

                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;

            }
            if(sum == i){
                System.out.println(i + " is a armstrong digit ");
            }

        }

    }

    /**
     * Write a program to calculate the sum of following series where n is input by user
     * 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
     */
    public void sumOfSequance(){

        Scanner sc = new Scanner(System.in);
        int num;
        double sum = 0;
        System.out.println("enter the num -> " + (num = sc.nextInt()));

        for(int i = 1; i <= num; ++i){

            double z = i;
            sum += 1 / z;

        }
        System.out.println("sum of sequance is -> " + sum );

    }

    /**
     * Compute the natural logarithm of 2, by adding up to n terms in the series
     * 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
     * where n is a positive integer and input by user.
     */

    public void logarithmOfTwo(){

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("enter the n -> " + (n = sc.nextInt()));

        }while(n < 0);

        double sum = 0;
        for(int i = 1; i <= n; ++i){

            double z = i;
            if(i % 2 == 0){
                sum -= 1 / z;
            }else{
                sum += 1 / z;
            }

        }
        System.out.println("sum is -> " + sum);

        System.out.println(Math.log(sum) / Math.log(2));


    }

    /**
     * Write a program that generates a random number and asks the user to guess what the number is.
     * If the user's guess is higher than the random number, the program should display
     * "Too high, try again." If the user's guess is lower than the random number,
     * the program should display "Too low, try again."
     * The program should use a loop that repeats until the user correctly guesses the random number
     */

    public void goodGuess(){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(50) + 1;
        int guess;
        do{
            System.out.println("guess the number " );
            guess = sc.nextInt();
            if(guess > num){
                System.out.println("Too high, try again");
            } else if (guess < num) {
                System.out.println("Too low, try again ");
            }
        }while(guess != num);
        System.out.println("you have succeed ");
        System.out.println("the guess number was " + guess );

    }

    /**
     * prints patterns
     */
    public void patterns(){

        //   pattern 1
        //   prints 4 x 10 "*"

        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        // pattern 2
        // prints "*" on and under the main diagonal

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        // pattern 3
        // prints on and under thi other diagonal

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j < 5 - i; ++j){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // pattern 4
        // prints this pattern
        //        *
        //       ***
        //      *****
        //     *******
        //    *********

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j < 4 - i; ++j){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        // pattern 5
        //          1
        //         222
        //        33333
        //       4444444
        //      555555555
        // this is similar with previous one

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j < 4 - i; ++j){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; ++j){
                System.out.print((i + 1));
            }
            System.out.println();
        }
        System.out.println("\n");

        // pattern 6
        // this is similar with previous one
        //           1
        //          212
        //         32123
        //        4321234
        //       543212345
        for(int  i = 0; i < 5; ++i){
            for(int j = 0; j < 4 - i; ++j){
                System.out.print(" ");
            }
            for(int j = i + 1; j > 0; --j){
                System.out.print(j);
            }
            for(int j = 2; j <= i + 1; ++j){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");

    }

    /**
     *
     * @param n
     * @return
     */
    public int fact(int n){
        int res = 1;
        for(int i = 2; i <= n; ++i){
            res *= i;
        }
        return res;
    }
    public int pow(int n){
        int res = 1;
        for(int i = 0; i < n; ++i){
            res *= n;
        }
        return res;
    }

    public void sinX(){

        Scanner sc = new Scanner(System.in);
        int x;
        double sum = 0.0;

        do{
             x = sc.nextInt();

        }while(x < 0);

        sum += x;

        for(int i = 3, j = 0; i <= x; i += 2, ++j){

            if((j & 1)== 1){
                sum -= (double) (pow(i)/fact(i));
            }else{
                sum +=  (double)(pow(i)/fact(i));
            }

        }

        sum = Math.pow(sum, x);
        System.out.println(Math.sin(sum));


    }

    public void cosX(){
        Scanner sc = new Scanner(System.in);
        int x;
        double sum = 1.0;

        do{
            x = sc.nextInt();

        }while(x < 0);

        for(int i = 2, j = 0; i <= x; i += 2, ++j){

            if((j & 1) == 1){
                sum -= (double)(pow(i)/fact(i));
            }else{
                sum += (double)(pow(i)/fact(i));
            }

        }
        sum = Math.pow(sum, x);
        System.out.println(Math.cos(sum));

    }


    public static void main(String[] args){

        Main ob = new Main();
        /*ob.multiplicationTable();
        ob.exp();
        ob.reversNum();
        System.out.println(ob.isPrime());
        ob.choice();
        ob.posNegZeroCount();
        ob.armstrongNumbers();
        ob.sumOfSequance();
        ob.logarithmOfTwo();
        ob.goodGuess();
        ob.patterns();*/
        //ob.sinX();
        //ob.cosX();

    }

}
