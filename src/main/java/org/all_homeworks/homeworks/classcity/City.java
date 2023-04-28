package org.all_homeworks.homeworks.classcity;

public class City {
    String name;
    int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }


    public static void main(String[] args){

        // 4. Սահմանել City class :  fields (name, population ) .
        //Ստեղծել  Yerevan, Moscow, New York , Paris  քաղաքները  համապատասխան  մարդաքանակով ։

        City yerevan = new City("Yerevan", 1075000);
        City moscow = new City("Moscow", 11980000);
        City newYork = new City("New York", 8468000);
        City paris = new City("Paris", 2161000);

        System.out.println("City " + moscow.name + " -> " + moscow.population + "\n");
        System.out.println("City " + yerevan.name + " -> " + yerevan.population + "\n");
        System.out.println("City " + paris.name + " -> " + paris.population + "\n");
        System.out.println("City " + newYork.name + " -> " + newYork.population + "\n");
    }
}
