package org.all_homeworks.homeworks.algorithm.algorithm2;

import java.math.BigInteger;

public class ToNthMultiplication {

    public static void main(String[] args){

        /*
              tpel  10 - 98 bolor erknish zuyg tveri artadryal@
         */
        int n = 99;
        BigInteger x = BigInteger.valueOf(1);

        for(int i = 10; i < n; i += 2){
            x = x.multiply(BigInteger.valueOf(i));
            //System.out.println(i);
        }
        System.out.println("value = " + x);
    }
}
