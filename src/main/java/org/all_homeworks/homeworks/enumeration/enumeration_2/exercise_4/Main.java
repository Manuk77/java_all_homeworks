package org.all_homeworks.homeworks.enumeration.enumeration_2.exercise_4;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = DaysOfWeek.SUNDAY;
        System.out.println(daysOfWeek.isWeekendDay(daysOfWeek.getNumber()));
    }
}
