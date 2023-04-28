package org.all_homeworks.homeworks.exceptions.exercise5;

public class SquareRoot {
    /**
     * this method counts square root of given number if it's positive
     * if it's not it will trow an exception
     * @param number
     * @return
     * @throws Exception
     */
    public double squareRoot(int number) throws IllegalArgumentException{
       if(number <= 0){
           try {
               throw new IllegalArgumentException("IllegalArgumentException:  Invalid Number");
           }catch (IllegalArgumentException ex){
               System.out.println(ex.getMessage());
           }finally {
               System.out.println("Good bay");
               return -1.0;
           }
       }
       return Math.sqrt(number);
    }

    public SquareRoot(){}
}
