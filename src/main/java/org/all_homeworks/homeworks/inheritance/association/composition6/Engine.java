package org.all_homeworks.homeworks.inheritance.association.composition6;

public class Engine {
    private String engineType;
    public boolean isWorking;

    public void setEngineType(String engineType){
        if(engineType != null && !engineType.isEmpty()){
            this.engineType = engineType;
        }
    }
    public String getEngineType(){
        return this.engineType;
    }

    public Engine(String engineType){
        this.engineType = engineType;
    }
    public Engine(){}



}
