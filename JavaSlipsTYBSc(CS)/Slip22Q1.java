abstract class Shape {
    protected double d1, d2;
    
    Shape(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    
    abstract public void printArea();
}

class Rectangle extends Shape{
    Rectangle(double l, double w) {
        super(l, w);
    }
    
    @Override
    public void printArea(){
        System.out.println("Area of Rectangle = " + d1*d2);
    }
}


class Triangle extends Shape{
    Triangle(double b, double h) {
        super(b, h);
    }
    
    @Override
    public void printArea(){
        System.out.println("Area of Triangle = " + 0.5 *(d1*d2));
    }
}


class Circle extends Shape{
    Circle(double r) {
        super(r, 0);
    }
    
    @Override
    public void printArea(){
        System.out.println("Area of Circle = " + (Math.PI *(d1*d1)));
    }
}

public class Slip22Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        Triangle triangle = new Triangle(5, 8);
        Circle circle = new Circle(5);
        
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
