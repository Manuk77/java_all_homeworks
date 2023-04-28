package org.all_homeworks.homeworks.unary_operators;

public class UnaryOperators {

    public static void main (String[] args){
        //4․ Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում
        // հետևյալը․
        // 1) -e
        // 2) -f
        // 3) +e
        // 4) -e +92
        // 5) !n1
        // 6) !(!n1)
        // 7) e++
        // 8) --f
        // 9) int x = 3;
        //    int y = ++x * 5 / x-- + --x;
        //    System.out.println("x is " + x);
        //    System.out.println("y is " + y);

        int e = 10;
        int f = -88;
        boolean n1 = true;
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        //x  1 - ov mecacnum e bazmapatkum e 5 ov 20 / 4 x 1-ov pakasacnum heto 5 in gumarum 2

        System.out.println("-e = " + (-e));
        System.out.println("-f = " + (-f));
        System.out.println("+e = " + (+e));
        System.out.println("-e + 92" + (-e + 92));
        System.out.println("!n1 = " + (!n1));
        System.out.println("!(!n1) = " + (!(!n1)));
        System.out.println("e++ = " + e++);
        System.out.println("--f = " + --f + "\n");
        System.out.println("y = " + y);



    }
}
