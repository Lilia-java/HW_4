public class RectangleNew extends ShapeAbs{
    double width;
    double length;

    public RectangleNew(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public RectangleNew(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RectangleNew() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double a;
        a = width * length;
        return a;
    }

    public double getPerimetr(){
        double p;
        p = 2.0 * (width+length);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
