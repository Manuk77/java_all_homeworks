package org.all_homeworks.homeworks.inheritance.association.composition6;

public class Heart {

    private float weight;

    /**
     * sets hearts weight
     * @param weight
     */
    public void setWeight(float weight){
        if(weight > 0 && weight < 1.5f){
            this.weight = weight;
        }
    }

    /**
     *
     * @return hearts weight
     */
    public float getWeight() {
        return weight;
    }
    public Heart(float weight){
        this.weight = weight;
    }

    public Heart(){}

    public void pounding(){
        System.out.println("heart is pounding");
    }

}
