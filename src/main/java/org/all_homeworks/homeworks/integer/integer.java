package org.all_homeworks.homeworks.integer;

public class integer {

    public static void main(String[] args){

    //1 - 5 - rd keter

    //byte

        byte a, b;
        a = 7;
        b = 11;
        System.out.println("byte tip");

        System.out.println("a ->" + a + "\t b -> " + b);
        System.out.println();

    //short

        short c, d;
        c = 48;
        d = 112;
        System.out.println("short tipi hatvac");

        System.out.println("c -> " + c + "\t d -> " + d);
        System.out.println();

    //int

        int e, f;
        e = 1534;
        f = -9532;

        System.out.println("integer tipi hatvac");

        System.out.println("e -> " + e + "\t f -> " + f);
        System.out.println();


    //long

        long g, h;
         g = 854203;
         h = -96332145;

         System.out.println("long tipi hatvac");

         System.out.println("g -> " + g + "\t h -> " + h);

    //max min arjqi hatvac byte, short, int, long tiperi hamar


        byte a1 = Byte.MAX_VALUE;
        byte b1 = Byte.MIN_VALUE;

        System.out.println("max min value of byte type");
        System.out.println("max = " + a1 + "\t min = " + b1);
        System.out.println();

        short c1 = Short.MAX_VALUE;
        short d1 = Short.MIN_VALUE;

        System.out.println("max min value of short type");
        System.out.println("max = " + c1 + "\t min = " + d1);
        System.out.println();
    }
}
