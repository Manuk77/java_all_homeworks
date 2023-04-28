package org.all_homeworks.homeworks.inheritance.association.composition6;

public class Human {
    private final Heart heaet;
    private String name;
    private int age;

    /**
     * sets human name
     * @param name
     */
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }

    }

    /**
     *
     * @return humans name
     */
    public String getName(){
        return this.name;
    }

    /**
     * sets humans age
     * @param age
     */
    public void setAge(int age){
        if(age > 0 && age < 111){
            this.age = age;
        }
    }

    /**
     *
     * @return humans age
     */
    public int getAge() {
        return age;
    }

    public Heart getHeart(){
        return this.heaet;
    }
    public Human(Heart heart){
        this.heaet = heart;
    }
}
