package org.all_homeworks.homeworks.exceptions.exercise1;

public class Reciprocal {
   public void reciprocal(int number) throws IllegalArgumentException{
       if(number != 0){
           System.out.println(number * -1);
       }else{
           throw new IllegalArgumentException("entered number must not be 0");
       }
   }
}
