package org.all_homeworks.homeworks.enumeration.shape_ex6;

public class Main {
    public static void main(String[] args) {
        ShapeClass shapeClass = new ShapeClass();
        ShapeType square = ShapeType.SQUARE;
        ShapeType circle = ShapeType.CIRCLE;
        ShapeType rectangle = ShapeType.RECTANGLE;


        square.setLength(7);
        square.setWeight(7);

        circle.setRadius(7);

        rectangle.setLength(7);
        rectangle.setWeight(6);

        square.setShapeClass(shapeClass);
        circle.setShapeClass(shapeClass);
        rectangle.setShapeClass(shapeClass);

        System.out.println(square.retGetArea());
        System.out.println(square.resGetPerimeter());

        System.out.println(circle.returnGetArea());
        System.out.println(circle.resultGetPerimeter());

        System.out.println(rectangle.retGetArea());
        System.out.println(rectangle.resGetPerimeter());

    }
}
