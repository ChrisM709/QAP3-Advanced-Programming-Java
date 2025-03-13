public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructors
    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // getters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // moveable point
    public MovablePoint move() {
        setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }
    
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

}
