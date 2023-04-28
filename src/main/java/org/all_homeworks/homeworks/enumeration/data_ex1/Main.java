package org.all_homeworks.homeworks.enumeration.data_ex1;

public class Main {
    public static void main(String[] args) {
        Planets mars = Planets.MARS;
        Planets jupiter = Planets.JUPITER;
        Planets mercury = Planets.MERCURY;
        Planets saturn = Planets.SATURN;
        Planets uranus = Planets.URANUS;
        Planets earth = Planets.Earth;
        Planets venus = Planets.VENUS;
        Planets neptune = Planets.NEPTUNE;



        System.out.println(mars.getPlanetName() + " " + mars.getYearLength());
        System.out.println(jupiter.getPlanetName() + " " + jupiter.getYearLength());
        System.out.println(earth.getPlanetName() + " " + earth.getYearLength());
        System.out.println(saturn.getPlanetName() + " " + saturn.getYearLength());
        System.out.println(uranus.getPlanetName() + " " + uranus.getYearLength());
        System.out.println(venus.getPlanetName() + " " + venus.getYearLength());
        System.out.println(mercury.getPlanetName() + " " + mercury.getYearLength());
        System.out.println(neptune.getPlanetName() + " " + neptune.getYearLength());

    }
}
