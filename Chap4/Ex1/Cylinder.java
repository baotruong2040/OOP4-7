package Ex1;
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder() {
        super();
    }
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }
}