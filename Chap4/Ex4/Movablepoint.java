package Ex4;
public class Movablepoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public Movablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Movablepoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Movablepoint() {
        super();
    }
    
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }
    @Override
    public String toString() {
        return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
    }
    public Movablepoint move() {
        super.setX(super.getX()+xSpeed);
        super.setX(super.getY()+ySpeed);
        return this;
    }
    
}