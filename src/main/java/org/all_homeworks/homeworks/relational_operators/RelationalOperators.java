package org.all_homeworks.homeworks.relational_operators;

public class RelationalOperators {

    public static void main(String[] args){
        //6․ Ստեղծել 2 փոփոխական(int aa = 10, int bb = 20), տպել console -ում  հետևյալը․
        //
        //    1) System.out.println(x < y);
        //    2) System.out.println(x <= y);
        //    3) System.out.println(x >= y);
        //    4) System.out.println(x > y);

        int aa = 10;
        int bb = 20;

        System.out.println("aa < bb = " + (aa < bb));
        System.out.println("aa <= bb = " + (aa <= bb));
        System.out.println("aa >= bb = " + (aa >= bb));
        System.out.println("aa > bb = " + (aa > bb));


        //    Additional  tasks

        //1)  float y = 2.1; F literal pti gerenq
        //
        //  2)  byte x = 5;
        //      byte y = 10;
        //      byte z = x + y;
        //
        // 3)   short x = 10;
        //       short y = 3;
        //       short z = x * y;
        //
        //
        // 4)    long x = 10; L literal pti grvi
        //       int y = 5; sxal chka
        //       y = y * x;  stex long@ int darcnelu jamanak errora talis(cast pti arvi)

        /*  long x = 10L;
            int y = 5;       senc petqa grenq
            y = (int)(y * x);
        */



        //8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև
        // փոփոխականի արժեքները տեղերով փոխել։
        //9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։


        int g = 7;
        int h = 4;

        g = g + h;
        h = g - h;
        g = g - h;

        System.out.println("g = " + g + "\t h = " + h);

        // es el xor ov

        int d = 10;
        int s = 6;

        d = d ^ s;
        s = s ^ d;
        d = d ^ s;

        System.out.println("d = " + d + "\t s = " + s);


        //10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
        // N * (N + 1) / 2
        int n = 100;
        System.out.println("sum = " + (n * (n + 1) / 2));

       /* int sum = 1;
        for(int i = 2; i <= n; ++i){
            sum += i;
        }
        System.out.println("sum = " + sum);
        */


        //            Bitwise & Logical Operators

        //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
        //    1) a & b
        //    2) a ^ b
        //    3) a | b
        //    4) ~a
        //    5) true || (a < 4)
        //    6) (b >= 6) || (++a <= 7);
        //    7) (a<b)?a:b
        //    8) b^b

        int a = 8;
        int b = 3;

        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a | b = " + (a | b));
        System.out.println("~a = " + (~a));
        System.out.println("true || (a < 4) = " + (true || (a < 4)));
        System.out.println("(b >= 6) || (++a <= 7) = " + ((b >= 6) || (++a <= 7)));
        System.out.println("(a < b)? a: b = " + ((a < b)? a: b));
        System.out.println("b ^ a = " + (b ^ a));           // a^b u b^a hamarjeq en


        //                  Shift Operator
        //
        //
        //    1․Տպել console -ում  հետևյալը․
        //
        //    1)  10 << 2
        //    2) -10 << 3
        //    3) 20 >> 2
        //    4) 15 >> 3
        //
        //    2․ Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։

        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 3 = " + (-10 << 3));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3) + "\n");

        //    2․ Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։

        int ff = 10;
        System.out.println("ff * 8 = " + (ff << 3));
        System.out.println("ff * 16 = " + (ff << 4));

    }
}
