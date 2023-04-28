package org.all_homeworks.homeworks.enumeration.unit_ex5;

public enum Unit {
    KILOGRAM(null, 0){
        final String  t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + KILOGRAM.uniteNumber + t + KELVIN.str;
        }
    },
    METER(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + METER.uniteNumber + t + METER.str ;
        }
    },
    SECOND(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + SECOND.uniteNumber + t + SECOND.str;
        }
    },

    MOLE(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + MOLE.uniteNumber + t + METER.str;
        }
    },
    KELVIN(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + KELVIN.uniteNumber + t + KELVIN.str;
        }
    },
    CANDELA(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + CANDELA.uniteNumber + t + CANDELA.str;
        }
    },
    NEWTON(KILOGRAM,METER,SECOND){
        final String t = " ";
        @Override
        public String getUnit() {
            return  super.toString() + " = " + KILOGRAM.uniteNumber * METER.uniteNumber / SECOND.uniteNumber + KILOGRAM.str + t + METER.str
                    + t + " / " + SECOND.str + " ^ 2";
        }
    },

    VOLTAGE(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + VOLTAGE.uniteNumber + t + VOLTAGE.str;
        }
    },

    OHM(null, 0){
        final String t = " ";
        @Override
        public String getUnit() {
            return super.toString() + " = " + OHM.uniteNumber + t + OHM.str;
        }
    },

    AMPERE(VOLTAGE, OHM){
        String t = " ";
        @Override
        public String getUnit() {
            return VOLTAGE.uniteNumber / OHM.uniteNumber + t + VOLTAGE.str + " / " + OHM.str;
        }
    };

    private int uniteNumber;
    private String str;
    private Unit kilogram;
    private Unit meter;
    private Unit second;
    private Unit voltage;
    private Unit ohm;
//  private Unit ampere;

    /**
     * this method sets unitNumber
     * @param uniteNumber
     */
    public void setUniteNumber(int uniteNumber) {
        if(uniteNumber > 0){
            this.uniteNumber = uniteNumber;
        }
    }

    /**
     * with this method we can get the uniteNumber
     * @return uniteNumber
     */
    public int getUniteNumber(){
        return uniteNumber;
    }

    /**
     * this method sets str
     * @param str
     */
    public void setStr(String str){
        if(str != null && !str.isEmpty()){
            this.str = str;
        }
    }

    /**
     * with this method we can get the str
     * @return str
     */
    public String getStr(){
        return str;
    }

    /**
     * this method sets Unit kilogram
     * @param kilogram
     */
    public void setKilogram(Unit kilogram){
        this.kilogram = kilogram;
    }

    /**
     * this method sets Unit meter
     * @param meter
     */
    public void setMeter(Unit meter){
        this.meter = meter;
    }

    /**
     * this method sets Unit second
     * @param second
     */
    public void setSecond(Unit second){
        this.second = second;
    }

    /**
     * this method sets Unit voltage
     * @param voltage
     */
    public void setVoltage(Unit voltage){
        this.voltage = voltage;
    }

    /**
     * this method sets Unit ohm
     * @param ohm
     */
    public void setOhm(Unit ohm){
        this.ohm = ohm;
    }

//  public void setAmpere(Unit ampere){
//    this.ampere = ampere;
//  }





    Unit(Unit voltage, Unit ohm){
        this.voltage = voltage;
        this.ohm = ohm;
    }

    Unit(String str, int uniteNumber){
        if(str != null && !str.isEmpty()){
            this.str = str;
        }
        if(uniteNumber > 0){
            this.uniteNumber = uniteNumber;
        }
    }

    Unit(Unit kilogram, Unit meter, Unit second){
        this.kilogram = kilogram;
        this.meter = meter;
        this.second = second;
    }






    public abstract String getUnit();

}
