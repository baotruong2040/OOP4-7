package Ex5;

public class Square extends Rectangle {
    
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide() {
        return super.getLength();
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }//maybe like this :/ ?

    @Override
    public String toString() {
        return "Square["+ super.toString()+",width="+super.getWidth()+",length="+super.getLength()+"]";
    }
}
