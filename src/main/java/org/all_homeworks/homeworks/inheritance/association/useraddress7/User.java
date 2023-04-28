package org.all_homeworks.homeworks.inheritance.association.useraddress7;

public class User {
    private String name;

    /**
     * sets user name
     * @param name
     */
    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    /**
     *
     * @return name
     */
    public String getName(){
        return this.name;
    }

    public User(String name){
        this.name = name;
    }
    public User(){}
}
