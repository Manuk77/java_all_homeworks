package org.all_homeworks.homeworks.exceptions.exercise3;

public class DividedByZero {
    /**
     * this method counts the result of division two numbers.
     * this method trows ArithmeticException if secondValue is equal to 0
     * @param firstValue
     * @param secondValue
     * @return result of division
     * @throws ArithmeticException
     */
    public int dividedByZero(int firstValue, int secondValue)throws ArithmeticException{
        int res = 0;
        try{
            res = firstValue / secondValue;
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException: " + ex.getMessage());
            return -1;
        }
        return res;
    }

    public DividedByZero(){}
}
