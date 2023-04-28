package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_4;

public enum DaysOfWeek {
    SUNDAY(7){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    MONDAY(1){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    TUESDAY(2){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    WEDNESDAY(3){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    THURSDAY(4){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    FRIDAY(5){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    },
    SATURDAY(6){
        @Override
        public boolean isWeekendDay(int number) {
            return (number > 5 && number < 8);
        }
    };

    private int number;

    /**
     * this method set the number of week to the instance one
     * @param number
     */
    public void setNumber(int number){
        if(number > 0 && number < 8){
            this.number = number;
        }else{
            throw new RuntimeException("invalid assigment to the number");
        }
    }

    /**
     * with this method we can get the number of week
     * @return number
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * the DaysOfWeek constructor
     * @param number
     */
    DaysOfWeek(int number){
        this.number = number;
    }

    public abstract boolean isWeekendDay(int number);
}
