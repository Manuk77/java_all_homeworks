package org.all_homeworks.homeworks.enumeration.shape_ex6;

public enum ShapeType {
    RECTANGLE(null, 0, 0){
        @Override
        public String retGetArea() {
            return super.retGetArea();
        }

        @Override
        public String resGetPerimeter(){
           return super.resGetPerimeter();
        }
    },
    CIRCLE(null, 0){
        @Override
        public String returnGetArea(){
            return super.returnGetArea();
        }

        @Override
        public String resultGetPerimeter() {
            return super.resultGetPerimeter();
        }

    },
    SQUARE(null, 0, 0){
        public String retGetArea() {
            return super.retGetArea();
        }

        @Override
        public String resGetPerimeter(){
            return super.resGetPerimeter();
        }
    };

    private ShapeClass shapeClass;
    private double weight;
    private double length;
    private double radius;

    /**
     * this method sets the weight to the instance weight
     * @param weight
     */
    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }
    }

    /**
     * with this method gets the instance weight
     * @return instance weight
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * this method sets the length to the instance length
     * @param length
     */
    public void setLength(double length){
        if(length > 0){
            this.length = length;
        }
    }

    /**
     * with this method we can get the instance length
     * @return
     */
    public double getLength(){
        return this.length;
    }

    /**
     * this method sets the radius to instance radius
     * @param radius
     */
    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }
    }

    /**
     * with this method we can get the instance radius
     * @return
     */
    public double getRadius(){
        return this.radius;
    }

    /**
     * this method sets the reference of type ShapeClass to the instance of shapeClass
     * @param shapeClass
     */
    public void setShapeClass(ShapeClass shapeClass){
        this.shapeClass = shapeClass;
    }

    /**
     * with this method we can get the reference of ShapeClass
     * @return
     */
    public ShapeClass getShapeClass(){
        return this.shapeClass;
    }

    /**
     * with this method we can get the rectangle or squares areas of String type
     * @return  rectangle or squares areas String type
     */
    public String retGetArea(){
        return "the area = " + this.shapeClass.getArea(this.shapeClass, this.weight, this.length) + " m ^ 2";
    }

    /**
     * whit this method we can get the circle area of String type
     * @return circle area of String type
     */
    public String returnGetArea(){
        return "the circle area = " + this.shapeClass.getArea(this.shapeClass, this.radius) + " m ^ 2";
    }

    /**
     * with this method we can get the rectangle or squares perimeters of String type
     * @return rectangle or squares perimeters of String type
     */
    public String resGetPerimeter(){
        return "the perimeter = " + this.shapeClass.getPerimeter(this.weight, this.length) + " m";
    }

    /**
     * with this method we can get the circles perimeter of String type
     * @return circles perimeter of String type
     */
    public  String resultGetPerimeter(){
        return "the perimeter of circle =  " + this.shapeClass.getPerimeter(this.radius) + " m";
    }

    /**
     * constructor for RECTANGLE and SQUARE
     * @param shapeClass
     * @param weight
     * @param length
     */
    ShapeType(ShapeClass shapeClass, double weight, double length){
        this.shapeClass = shapeClass;
        this.length = length;
        this.weight = weight;
    }

    /**
     * constructor for CIRCLE
     * @param shapeClass
     * @param radius
     */
    ShapeType(ShapeClass shapeClass, double radius){
        this.shapeClass = shapeClass;
        this.radius = radius;
    }

}
