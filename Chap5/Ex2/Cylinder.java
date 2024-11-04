package Ex2;

public class Cylinder {
    private Circle base;
    private double height = 1.0;

    public Cylinder() {
        base = new Circle();
        height =1.0;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder["+base.toString()+",height="+height+"]";
    }
}
