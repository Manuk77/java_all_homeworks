package org.all_homeworks.homeworks.enumeration.distance_from_sun_ex4;

public enum PlanetsDistanceFromSun {
    MERCURY(35_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return MERCURY.planetsDistanceFromTheSun;
        }
    },
    VENUS(67_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return VENUS.planetsDistanceFromTheSun;
        }
    },
    EARTH(93_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return EARTH.planetsDistanceFromTheSun;
        }
    },
    MARS(142_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return MARS.planetsDistanceFromTheSun;
        }
    },
    JUPITER(484_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return JUPITER.planetsDistanceFromTheSun;
        }
    },
    SATURN(889_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return SATURN.planetsDistanceFromTheSun;
        }
    },
    URANUS(1_790_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return URANUS.planetsDistanceFromTheSun;
        }
    },
    NEPTUNE(2_880_000_000L){
        @Override
        public long PlanetsDistanceFromTheSun() {
            return NEPTUNE.planetsDistanceFromTheSun;
        }
    };

    private long planetsDistanceFromTheSun;
    public abstract long PlanetsDistanceFromTheSun();



    PlanetsDistanceFromSun(long planetsDistanceFromTheSun){
        if(planetsDistanceFromTheSun > 200){
            this.planetsDistanceFromTheSun = planetsDistanceFromTheSun;
        }
    }

}
