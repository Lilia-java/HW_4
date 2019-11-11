public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        float[] arr = new float[2];
        return arr;
    }

    public void setXYSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y +")"+
                "Speed=(" + xSpeed + ", " + ySpeed +
                ")";
    }

    public MovablePoint move(){
        //Point point = new Point();
        x =+ xSpeed;
        y =+ ySpeed;
        return this;
    }
}
