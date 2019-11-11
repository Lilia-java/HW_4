public class Circle1 implements GeometricObject {
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double a;
        a = Math.PI * radius * radius;
        return a;
    }

    public double getPerimeter(){
        double p;
        p = 2.0 * Math.PI * radius;
        return p;
    }
}
