package org.all_homeworks.homeworks.enumeration.data_ex1;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    Earth("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private String planetName;
    private int yearLength;

    public void setPlanetName(String planetName) {
        if(planetName != null && !planetName.isEmpty()){
            this.planetName = planetName;
        }

    }

    public void setYearLength(int yearLength) {
        if(yearLength > 0){
            this.yearLength = yearLength;
        }
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getYearLength() {
        return yearLength;
    }

    private Planets (String planetName, int yearLength) {
        if (planetName != null && !planetName.isEmpty()) {
            this.planetName = planetName;
        }
        if (yearLength > 0) {
            this.yearLength = yearLength;
        }

    }

}

