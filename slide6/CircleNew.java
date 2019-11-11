public class CircleNew extends ShapeAbs{
    double radius;

    public CircleNew(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public CircleNew(double radius) {
        this.radius = radius;
    }

    public CircleNew() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea(){
        double a;
        a = Math.PI * radius * radius;
        return a;
    }
    @Override
    public double getPerimetr(){
        double p;
        p = 2.0 * Math.PI * radius;
        return p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}