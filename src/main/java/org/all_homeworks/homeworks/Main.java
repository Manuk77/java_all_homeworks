package org.all_homeworks.homeworks;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //System.out.println("hello world");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       sc.close();
       /*int y = 0;
       int z = 0;
       int t = 0;
       y += i % 10;
       t = i / 10;
       y += t % 10;
       z = t / 10;
       y += z % 10;*/
        int jam = 0;
        jam = i / 3600;
        int temp = 0;
         temp = i % 3600;
        int rope = 0;
        rope = temp / 60;
        int varkyan = 0;
        varkyan = temp % 60;

        System.out.println("jam = " + jam + " rope = " + rope + " varkyan = " + varkyan);

      // System.out.println("y = " + y);
       //System.out.println("Manuk Movsesyan " + i);



    }


}