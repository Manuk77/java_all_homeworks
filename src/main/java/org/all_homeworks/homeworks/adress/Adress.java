package org.all_homeworks.homeworks.adress;

public class Adress {
    static {
        System.out.println("Adress class");
    }
    String country;
    String region;
    String city;
    String street;
    int house;

    public Adress(String country, String region, String city, String street, int hous){

        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.house = hous;

    }
    class Bank{

        static {
            System.out.println(" Class Bank ");
        }
        String bankName;
        Adress address;
        public Bank(String bankName){

            this.bankName = bankName;

        }


    }


    public static void main(String[] args){

        // 6. Սահմանել Address class :  fields (country , region, city , street, house ) .
        // Սահմանել Bank class :  fields (bankName,   address (type Address)) .

        Adress obAdress = new Adress("Georgia", "Samtskhe-Javakheti", "Akhaltsikhe", "first", 22);
        Bank obBank = obAdress.new Bank("Convers Bank");
        obBank.address = obAdress;
        System.out.println(obBank.address.house);



    }

}
