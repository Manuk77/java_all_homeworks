package org.all_homeworks.homeworks.java_statements2;

public class JavaStatements {

    /**
     *
     * @param num
     * @return
     */
    public boolean isOdd(int num){
        System.out.println("tokosov funkcia ");
        return(num % 2 == 1);
    }

    /**
     *
     * @param num
     * @return
     */
    public boolean isOddd(int num){

        System.out.println("\nbitain ev ov method ");
        return((num & 1) == 1);
    }

    /**
     *
     * @param num
     * @return
     */
    public boolean isNegativ(int num){

        System.out.println("isNegativ method");
        return(num < 0);

    }

    /**
     *
     * @param num
     * @return
     */
    public boolean lesOrMore(int num){

        System.out.println("lesOrMore method");
        return((num < 8 && num > 5) || (num < 20 && num > 15));

    }

    /**
     *
     * @param num
     * @return
     */
    public boolean isDivided(int num){

        System.out.println("isDividet method");
        return((num % 5 == 0) && (num % 7 == 0));
    }

    /**
     *
     * @param num
     * @return
     */
    public boolean thirtNumberDividetBySeven(int num){

        System.out.println("thirtNumberDividetBySeven method");
        return((num % 10) % 7 == 0);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */

    public int maxValue(int a, int b, int c){

        System.out.println("maxValue method");
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }
        return c;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean isIn(int x, int y){

        System.out.println("isIn method");
        return((x >= -5 && x <= 5) && (y >= -5 && y <= 5));

    }

    /**
     *
     * @param year
     * @return
     */
    public boolean nahanjTari(int year){

        System.out.println("nahanjTari method");
        return((year % 4 == 0 ) && (year % 100 != 0));

    }

    public static void main(String[] args){

        //  1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
        //  2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
        //  3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
        //    Կամ փոքր  20 ից և մեծ 15 ից ․
        //  4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
        //  5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
        //  6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
        //  7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
        //  8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
        //  (նահանջ է համարվում այն տարին որը բաժանվում է 4 և 400 բայց միևնույն ժամանակ չի բաժանվում 100-ի)

        JavaStatements ob = new JavaStatements();
        System.out.println(ob.isOdd(7));
        System.out.println(ob.isOddd(7) + "\n");
        System.out.println(ob.isNegativ(-5) + "\n");
        System.out.println(ob.lesOrMore(18) + "\n");
        System.out.println(ob.isDivided(121) + "\n");
        System.out.println(ob.thirtNumberDividetBySeven(127) + "\n");

        System.out.println(ob.maxValue(12, 24, 10) + "\n");
        System.out.println(ob.isIn(1, 5) + "\n");
        System.out.println(ob.nahanjTari(2012) + "\n");

    }
}
