package org.all_homeworks.homeworks.last_statements;

public class LastStatements {

    /**
     *
     * @param n
     */
    public void maxMin(int n){
        System.out.println("tvabanakan ijin -> " +((n + 1) / 2) + "\n");
    }

    /**
     *
     * @param num
     */
    public void sum(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " + sum + "\n");
    }

    /**
     *
     * @param n
     */
    public void erknishZuyg(int n){
        int sum = 0;
        int i = 2;
        while(i <= n){
            if(i / 10 != 0){
                sum += i;
            }
            i += 2;
        }
        System.out.println("sum = " + sum + "\n");
    }

    public static void main(String[] args){

        //8. Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։
        //9․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է  մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։
        //10․ Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։

        LastStatements ob = new LastStatements();

        ob.maxMin(152);
        ob.erknishZuyg(124);
        ob.sum(12354);

    }
}
