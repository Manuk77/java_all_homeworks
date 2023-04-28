package org.all_homeworks.homeworks.enumeration.shape_ex6;

public abstract class Shape {
    /**
     * this method will be counted area of some shapes when it will be overridden in concrete class
     * @param shapeClass
     * @param weight
     * @param length
     * @return
     */
    public abstract double getArea(ShapeClass shapeClass, double weight, double length);

    /**
     * this method will be counted perimeter of some shapes when it will be overridden in concrete class
     * @param weight
     * @param length
     * @return
     */
    public abstract double getPerimeter(double weight, double length);

}
