interface Operation {
    final public double pi = 3.142;
    
    abstract public double area();
    abstract public double volume();
}

class Cylinder implements Operation {
    public double r, h;
    
    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    @Override
    public double area() {
        return 2*pi*r * (r+h);
    }
    
    @Override
    public double volume() {
        return pi * (r*r) * h;
    }
}

public class Slip11Q1 {
    public static void main(String[] aargs) {
        Cylinder c = new Cylinder(4.3, 8.2);
        System.out.println("Area of cylinder = " + c.area());
        System.out.println("Volume of cylinder = " + c.volume());
    }
}
