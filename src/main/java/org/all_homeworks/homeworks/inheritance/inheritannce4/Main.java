package org.all_homeworks.homeworks.inheritance.inheritannce4;

public class Main {

    public static void main(String[] args) {

        Track obj = new Track();
        obj.setPassengerCount(2);
        obj.setEngineType("electric");
        obj.setCapacity(5);
        System.out.println(obj.getCapacity());
        System.out.println(obj.getPassengerCount());
        System.out.println(obj.getEngineType());

    }
}
