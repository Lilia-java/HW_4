public class Point2D {
    float x;
    float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        return arr;
    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Float.compare(point2D.x, x) == 0 &&
                Float.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        long temp1;
        temp = Float.floatToIntBits(x);
        temp1 = Float.floatToIntBits(y);
        result = (int) (temp ^ (temp >>> 32));
        result = (int) (temp1 ^ (temp1 >>> 32));
        return result;
    }
}
