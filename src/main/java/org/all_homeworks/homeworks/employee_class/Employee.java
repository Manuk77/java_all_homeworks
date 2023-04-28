package org.all_homeworks.homeworks.employee_class;

public class Employee {
    static {
        System.out.println("Employee class");
    }
    int id;
    String name;
    String department;
    int age;
    String gender;
    public Employee(int id, String name, String department, int age, String gender){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * prints the all thing of class Employee
     */
    public void printEmployee(){
        System.out.println("ID \t Name \t Department \t AGE \t Gender ");
        System.out.println(id + "\t" + name + "\t\t" + department + "\t\t " + age + "\t\t  " + gender + "\n");
    }







    public static void main(String[] args){

        //          7. Սահմանել Employee class-ը, որը ունի
        //        ◦ fields (id, name, department, age , gender)
        //        ◦ methods printEmploye() որը տպում է Employe  մասին ամբողջական ինֆորմացիա։
        //          Ստեղծել  3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են
        //          նույն դեպարտամենտում և ունեն նույն տարիքը։


        Employee txa1 = new Employee(22, "Vahram", "Finans", 21, "Txa");
        txa1.printEmployee();
        Employee txa2 = new Employee(23, "Hovhannes", "Finans", 21, "Txa");
        txa2.printEmployee();
        Employee axjik = new Employee(15, "Anna-Maria", "Kadastr", 27, "Axjik");
        axjik.printEmployee();

    }
}
