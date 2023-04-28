package org.all_homeworks.homeworks.enumeration.unit_ex5;

public class Main {
    public static void main(String[] args) {
        Unit meter = Unit.METER;
        Unit voltage = Unit.VOLTAGE;
        Unit ohm = Unit.OHM;
        Unit kilogram = Unit.KILOGRAM;
        Unit second = Unit.SECOND;
        Unit newton = Unit.NEWTON;

        meter.setStr("metr");
        meter.setUniteNumber(5);

        kilogram.setStr("kg");
        kilogram.setUniteNumber(7);

        second.setStr("sec");
        second.setUniteNumber(1);

        System.out.println(newton.getUnit());
        voltage.setStr("volt");
        voltage.setUniteNumber(8);

        ohm.setStr("ohm");
        ohm.setUniteNumber(11);

        Unit amper = Unit.AMPERE;

        System.out.println(amper.getUnit());

    }
}
