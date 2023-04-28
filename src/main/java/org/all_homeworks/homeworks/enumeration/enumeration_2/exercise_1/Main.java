package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_1;


public class Main extends ChangeLights {
    public static void main(String[] args) {
        for(TrafficLights trafficLights : TrafficLights.values()){
            for(int i = 0; i < 2; ++i){
                if(i < 1){
                    System.out.println("\n the color of traffic light is -> " + trafficLights.changeStates(trafficLights));
                }
                System.out.print(i + 1 + " ");
            }
        }


    }
}
