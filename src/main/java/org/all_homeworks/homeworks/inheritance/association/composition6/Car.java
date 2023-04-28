package org.all_homeworks.homeworks.inheritance.association.composition6;

public class Car {
    private final Engine engine;


    public Engine getEngine(){
        return this.engine;
    }
    public Car(Engine engine){
        this.engine = engine;
    }

    public boolean isEnginStart(){
        return engine.isWorking;
    }
    public void startEngine(){
        engine.isWorking = true;
    }
    public void stallEngine(){
        engine.isWorking = false;
    }


}
