package chapter6;

public class Rectangle {

    private double length;
    private double width;

    // Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length; // Attribute value can be set directly
        setWidth(width); // Attribute value can be set through a setter method
    }

    // Getter Methods
    public double getLength(){
        return length;
    }

    public  double getWidth(){
        return width;
    }

    // Setter Methods
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // Calculation Methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

}
