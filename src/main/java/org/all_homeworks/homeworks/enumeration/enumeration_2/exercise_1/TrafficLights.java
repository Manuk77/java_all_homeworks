package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_1;

public enum TrafficLights {
    RED{
        @Override
        public String changeStates(TrafficLights trafficLights) {
            return trafficLights.toString();
        }
    },
    YELLOW{
        @Override
        public String changeStates(TrafficLights trafficLights) {
            return trafficLights.toString();
        }
    },
    GREEN{

        @Override
        public String changeStates(TrafficLights trafficLights) {
            return trafficLights.toString();
        }
    };


    private TrafficLights trafficLights;

    /**
     * this method sets the trafficLights reference to the instance one
     * @param trafficLights
     */
    public void setTrafficLights(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }

    /**
     * with this method we can get the trafficLights reference
     * @return trafficLights reference
     */
    public TrafficLights getTrafficLights(){
        return this.trafficLights;
    }

    /**
     * this method will change the state of trafficLights when it will be overridden
     * @param trafficLights
     * @return
     */
    public abstract String changeStates(TrafficLights trafficLights);



}
