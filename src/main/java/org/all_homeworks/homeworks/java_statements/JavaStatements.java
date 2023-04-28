package org.all_homeworks.homeworks.java_statements;

public class JavaStatements {

    /**
     * artacum e 1 - 200 tver@
     */
    public void cout(){
        int i = 1;
        while(i < 201){

            System.out.println("i = " + i + "\n");
            ++i;
        }
    }

    /**
     *
     * @param num
     * artacum e argumenti araji tiv@
     */
    public void firstNumber(int num){
        int temp = 0;
        while(num != 0){
            temp = num % 10;
            num = num / 10;
        }
        System.out.println("first number -> " + temp + " \n");
    }

    /**
     *
     * @param num
     */
    public void sqrt(int num){

        System.out.println("sqrt of num is -> " + (num * num) + "\n");

    }

    /**
     *
     * @param n
     */
    public void sumOfDividetByFive(int n){
        int i = 5;
        int sum = 0;
        while(i <= n){
            sum += i;
            i += 5;
        }
        System.out.println("sum = " + sum + "\n");
    }


    public static void main(String[] args){


        //    9. Ինչ ավելացնենք  ___ բաց թողնված դիրքում որ տպի 8 ․
        //        int x = 0;
        //        while (x++ < 10) {
        //          ____
        //       }
        //       System.out.println(x);

        int x = 0;
        while(x++ < 10){
            if(x == 8){
                System.out.println("x = " + x + "\n");
                break;
            }
        }

        //10. Գտնել սխալը և ուղղել․
        //    1)   int x = 2;
        //          int y = 5;
        //         while(x < 10) {
        //          y++;          anverj cikla linum es depqum
        //          }
        // anverj cikla linum es depqum
        // y - i poxaren pti grenq x++;

        //2)       int x = 15;
        //            while (x > 10) {
        //              x = x--;
        //            }
        //            System.out.println(x);
        // misht arjeq@ linum e 15 eli anverj cikla linum
        // x = x-- i poxaren grela petq (x-- kam --x) es  depqum tarberutyun chka



        // 11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
        // 12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.
        // 13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը
        // 14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
        // 15․ Գրել method, որը console -ից ստանում է  N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը։

        JavaStatements ob = new JavaStatements();
        ob.cout();
        ob.firstNumber(721453698);
        ob.sqrt(5);
        ob.sumOfDividetByFive(15);

        int xx = 1, yy = 0;
        while(xx < 5 && yy < 10){
            System.out.println("xx + yy = " + (xx + yy));
            ++xx;
            ++yy;
        }


    }

}
