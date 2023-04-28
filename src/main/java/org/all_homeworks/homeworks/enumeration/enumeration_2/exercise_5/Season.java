package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_5;

public enum Season {
    SPRING(1, 22, 10){
        @Override
        public String whichSeasonIs(int temperature) {
            if(temperature >= SPRING.lowTemperature && temperature <= SPRING.highTemperature){
                return temperature + " C the temperature corresponds " + super.toString();
            }
            return "";
        }
    },
    SUMMER(2, 43, 28){
        @Override
        public String whichSeasonIs(int temperature) {
            if(temperature >= SUMMER.lowTemperature && temperature <= SUMMER.highTemperature){
                return temperature + " C the temperature corresponds " + super.toString();
            }
            return "";
        }
    },
    AUTUMN(3, 33, 16){
        @Override
        public String whichSeasonIs(int temperature) {
            if(temperature >= AUTUMN.lowTemperature && temperature <= AUTUMN.highTemperature){
                return temperature + " C the temperature corresponds " + super.toString();
            }
            return "";
        }
    },
    WINTER(4, 10, -25){
        @Override
        public String whichSeasonIs(int temperature) {
            if(temperature >= WINTER.lowTemperature && temperature <= WINTER.highTemperature){
                return temperature + " C the temperature corresponds " + super.toString();
            }
            return "";
        }
    };

    private int numberOfSeason;
    private int highTemperature;
    private int lowTemperature;

    /**
     * this method sets the number of the season to the instance one
     * @param numberOfSeason
     */
    public void setNumberOfSeason(int numberOfSeason){
        if(numberOfSeason > 0 && numberOfSeason < 5){
            this.numberOfSeason = numberOfSeason;
        }else{
            throw new RuntimeException("invalid assigment, the numberOfSeason must be in [1,4] range");
        }
    }

    /**
     * with this method we can get the number of the season
     * @return numberOfSeason
     */
    public int getNumberOfSeason(){
        return this.numberOfSeason;
    }

    /**
     * this method sets the highTemperature to the instance one
     * @param highTemperature
     */
    public void setHighTemperature(int highTemperature){
        if(highTemperature > 0){
            this.highTemperature = highTemperature;
        }else{
            throw new RuntimeException("invalid assigment, the highTemperature must be more than 0 celsius");
        }
    }

    /**
     * with this method we can get the highTemperature
     * @return highTemperature
     */
    public int getHighTemperature(){
        return  this.highTemperature;
    }

    /**
     * this method sets the lowTemperature to the instance one
     * @param lowTemperature
     */
    public void setLowTemperature(int lowTemperature){
        if(lowTemperature < 29){
            this.lowTemperature = lowTemperature;
        }else{
            throw new RuntimeException("invalid assigment, the lowTemperature must be less than 29");
        }
    }

    /**
     * with this method we can get the lowTemperature
     * @return lowTemperature
     */
    public int getLowTemperature(){
        return this.lowTemperature;
    }

    Season(int numberOfSeason, int highTemperature, int lowTemperature){
        this.numberOfSeason = numberOfSeason;
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
    }

    public abstract String whichSeasonIs(int temperature);

}
