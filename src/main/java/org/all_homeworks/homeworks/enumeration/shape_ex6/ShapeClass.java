package org.all_homeworks.homeworks.enumeration.shape_ex6;

public class ShapeClass extends Shape {
    /**
     * this method overrides getArea method
     * @param shapeClass
     * @param weight
     * @param length
     * @return rectangle or square areas
     */
    @Override
    public double getArea(ShapeClass shapeClass, double weight, double length) {
        return shapeClass.rectangleOrSquare(weight, length);
    }

    /**
     * this method overloads the getArea method
     * @param shapeClass
     * @param radius
     * @return
     */
    public double getArea(ShapeClass shapeClass, double radius){
       return shapeClass.circle(radius);
    }

    /**
     * this method overrides the getPerimeter for counting square and rectangle perimeters
     * @param weight
     * @param length
     * @return rectangles or squares perimeter
     */
    @Override
    public double getPerimeter(double weight, double length) {
        return 2 * weight + 2 * length;
    }

    /**
     * this method overloads the getPerimeter for counting circle perimeter
     * @param radius
     * @return circle perimeter
     */
    public double getPerimeter(double radius){
        return Math.PI * 2 * radius;
    }

    /**
     * this method counts the rectangle or square's area
     * @param length
     * @param weight
     * @return rectangle or square's area
     */
    public double rectangleOrSquare(double length, double weight){
        return length * weight;
    }

    /**
     * counts circle area
     * @param radius
     * @return circle area
     */
    public double circle(double radius){
        return Math.PI * radius * radius;
    }
}
