package org.all_homeworks.homeworks.inheritance.association.aggregation5;

import java.util.ArrayList;
import java.util.List;
public class CarShop {

    static{
        System.out.println("class carShop");
    }
    private String name;
    private List<CarBrand> brand;
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }


    public void setBrand(List<CarBrand> brand){
        this.brand = brand;
    }

    /**
     * @return carBrands name list
     */
    public List<String> getBrand(){
        List<String> car_brand = new ArrayList<String>();
        for(CarBrand car : this.brand){
            car_brand.add(car.getCarName()); // adds name of each carBrande to the name list
        }
        return car_brand;
    }


    public CarShop(String name){
        this.name = name;
    }
    public CarShop(){}



}
