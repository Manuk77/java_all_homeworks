package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_3;

public enum Planet {
    MERCURY("Mercury", 35_000_000L, 0.330F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + MERCURY.mass + exp + " kg";
        }
    },
    VENUS("Venus", 67_000_000L, 4.87F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + VENUS.mass + exp + " kg";
        }
    },
    EARTH("Earth", 93_000_000L, 5.97F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + EARTH.mass + exp + " kg";
        }
    },
    MARS("Mars", 142_000_000L, 0.642F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + MARS.mass + exp + " kg";
        }
    },
    JUPITER("Jupiter", 484_000_000L, 1898.0F){
        @Override
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + JUPITER.mass + exp + " kg";
        }
    },
    SATURN("Saturn", 889_000_000L, 568.0F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + SATURN.mass + exp + " kg";
        }
    },
    URANUS("Uranus", 1_790_000_000L, 86.8F){
        @Override
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + URANUS.mass + exp + " kg";
        }
    },
    NEPTUNE("Neptune", 2_880_000_000L, 102.0F){
        public String printNameMassPlanet() {
            String exp = " 10E24";
            return super.toString() + " " + NEPTUNE.mass + exp + " kg";
        }
    };

    private String planetName;
    private long distance;
    private float mass;

    /**
     * this method sets the planet name to the instance one
     * @param planetName
     */
    public void setPlanetName(String planetName){
        if(planetName != null && !planetName.isEmpty()){
            this.planetName = planetName;
        }else{
            if(planetName == null){
                throw new RuntimeException("NullPointerException");
            }
        }
    }

    /**
     * @return planetName
     */
    public String getPlanetName(){
        return this.planetName;
    }

    /**
     * this method sets the planet distance from the sun to the instance one
     * @param distance
     */
    public void setDistance(long distance){
        if(distance > 500){
            this.distance = distance;
        }else{
            throw new RuntimeException("invalid assigment, the distance should be more then 500 miles");
        }
    }

    /**
     * with this method we can get the planet distance from the sun
     * @return distance
     */
    public long getDistance(){
        return this.distance;
    }

    /**
     * this method sets the planet mass to the instance one
     * @param mass
     */
    public void setMass(float mass){
        if(mass > 0.0f){
            this.mass = mass;
        }else{
            throw new RuntimeException("invalid assigment, the mass should be more then 2000 tons");
        }
    }

    /**
     * with this method we can get the planet mass
     * @return mass
     */
    public float getMass(){
        return this.mass;
    }


    Planet(String planetName, long distance, float mass){
        this.planetName = planetName;
        this.distance = distance;
        this.mass = mass;
    }

    public abstract String printNameMassPlanet();
}
