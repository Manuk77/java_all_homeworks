package org.all_homeworks.homeworks.inheritance.inheritannce4;

public class Track extends Car{
    {
        System.out.println("class Track");
    }
    private int capacity;

    public Track(){
        super();
    }

    /**
     * sets the given value to the instance private field
     * @param capacity
     */
    public void setCapacity(int capacity) {
        if(capacity > 0){
            this.capacity = capacity;
        }
    }

    /**
     * gets the value from the private field
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

}
