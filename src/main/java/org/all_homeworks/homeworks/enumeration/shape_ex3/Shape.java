package org.all_homeworks.homeworks.enumeration.shape_ex3;

public enum Shape {
    SQUARE(1){
        @Override
        public double area(double... side) {
            return side[0] * side[0];
        }
    },
    RECTANGLE(2){
        @Override
        public double area(double... weightLength){
            return weightLength[0] * weightLength[1];
        }
    },

    CIRCLE(3){
        @Override
        public double area(double... radius){
            return Math.PI * radius[0] * radius[0];
        }
    };


    private int number;


    public int getNumber(){
        return this.number;
    }

    Shape(int number){
        if(number > 0){
            this.number = number;
        }
    }

    /**
     * abstract method which counts area of the sum shape
     * @param parameters
     * @return double vale
     */
    public abstract double area(double... parameters);


}
