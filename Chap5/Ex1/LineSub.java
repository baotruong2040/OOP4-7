package Ex1;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        end.setXY(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }
    public void setEnd(int endX, int endY){
        end.setXY(endX, endY);
    }

    public int getBeginX() {
        return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    @Override
    public String toString() {
        return "begin=("+super.getX()+","+super.getY()+"),end=("+end.getX()+","+end.getY()+")";
    }

    public int getLength() {
        int xDiff = Math.abs(super.getX()-end.getX());
        int yDiff = Math.abs(super.getY()-end.getY());
        double length = Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        int intLength = (int)length;

        return intLength;
    }
    public double getGradient() {
        int xDiff = Math.abs(super.getX()-end.getX());
        int yDiff = Math.abs(super.getY()-end.getY());
        return Math.atan2(yDiff, xDiff);
    }
}
