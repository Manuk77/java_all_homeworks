package org.all_homeworks.homeworks.rectangle;

public class Rectangle {

    float length;
    float widht;

    public Rectangle(float length, float widht){
        this.length = length;
        this.widht = widht;
    }

    /**
     *
     * @param length
     * @param widht
     * @return
     */
    public float calculateArea(float length, float widht){
        return length * widht;
    }



    public static void main(String[] args){

        // 5. Սահմանել Rectangle class :  fields (length, width )  , methods ( calculateArea() ) .
        //Ստեղծել  ուղղանկյուն (բարձրություն 5,  լայքն 14)  և հաշվել  ուղղանկյան մակերեսը ։

        Rectangle ob1 = new Rectangle(5.5F, 9.4F);
        System.out.println("rectangle area -> " + ob1.calculateArea(ob1.length, ob1.widht));
    }
}
