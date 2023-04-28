package org.all_homeworks.homeworks.inheritance.inheritannce4;

public class Car {
    static{
        System.out.println("class car");
    }
    private int passengerCount;
    private StringBuilder engineType = new StringBuilder();
    public Car () {}

    /**
     * sets the given passengerCount to the instance passengerCount
     * @param passengerCount
     */
    public void setPassengerCount(int passengerCount){
        if(passengerCount > 1){
            this.passengerCount = passengerCount;
        }
    }

    /**
     *
     * @return passengerCount
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * sets the given engineType to the instance engineType
     * @param engineType
     */
    public void setEngineType(String engineType){
        if(engineType == null || engineType.isEmpty()){
            System.out.println("the given string is empty or has no reference to the String object");
            return;
        }
        for(int i = 0; i < engineType.length(); ++i){
            if(engineType.charAt(i) > 64 && engineType.charAt(i) < 91 ||
                    engineType.charAt(i) > 96 && engineType.charAt(i) < 123){
                this.engineType.append(engineType.charAt(i));
            }
        }
    }

    /**
     *
     * @return engineType
     */
    public StringBuilder getEngineType() {
        return engineType;
    }

}
