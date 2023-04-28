package org.all_homeworks.homeworks.inheritance.association.aggregation5;

public class CarBrand {
    {
        System.out.println("clas CarBrand");
    }

    private String carName;

    /**
     * sets carName to the private instance field if it's not null or empty
     * @param carName
     */
    public void setCarName(String carName){
        if(carName != null && !carName.isEmpty()){
            this.carName = carName;
        }
    }

    /**
     *
     * @return carName
     */
    public String getCarName(){
        return this.carName;
    }

    public CarBrand(String carName){
        this.carName = carName;
    }

    public CarBrand(){}
}
