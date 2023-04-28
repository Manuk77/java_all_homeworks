package org.all_homeworks.homeworks.enumeration.days_of_week_ex2;

public enum DaysOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private  int number;

    public int getNumber() {
        return number;
    }

    DaysOfWeek(int number){
        if (number > 0 && number < 8){
            this.number = number;
        }
    }

}
