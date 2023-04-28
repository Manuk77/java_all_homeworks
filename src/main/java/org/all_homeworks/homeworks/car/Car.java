package org.all_homeworks.homeworks.car;

public class Car {

    static {
        System.out.println("class car");
    }

    String model;
    String color;
    int currentSpeed;
    boolean isEngineStart;

    public Car(String model, String color){

        this.model = model;
        this.color = color;

    }

    /**
     * prints the model of car and color
     */

    public void print(){
        System.out.println("Model \t\t\t\t color");
        System.out.println(model + "\t\t " + color + "\n");
    }

    /**
     * starts the engine
     */
    public void stsrtEngine(){
        isEngineStart = true;
    }

    /**
     * stops the engine
     */
    public void stopEngine(){
        isEngineStart = false;
    }



    public static void main(String[] args){

        // 8.     8. Սահմանել Car class-ը, որը ունի
        //        ◦  fields (model, color, currentSpeed (default արժեքը 0), isEngineStart (true or false))
        //        ◦  methods (stopEngine() անջատում է մատոռը , startEngine()  միացնում է մատոռը)
        //           Ստեղծել Mercedes  C203 սև   և   S505 սպիտակ  մակնիշի մեքենաներ․

        Car car1 = new Car("Mersedes C203", "black");
        Car car2 = new Car("Mersedes S505", "white");
        car1.print();
        car2.print();
    }
}
