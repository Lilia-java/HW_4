public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan","Gagarin st, 23", "FIIT", 2, 20000.0);
        System.out.println(student.toString());
        System.out.println();

        Point2D point2D = new Point2D(0.0f,0.0f);
        System.out.println(point2D.toString());
        System.out.println();

        Point3D point3D = new Point3D(0.0f,0.0f,0.0f);
        System.out.println(point3D.toString());
        System.out.println();

        MovablePoint movablePoint = new MovablePoint(0.0f,0.0f,0.0f,0.0f);
        System.out.println(movablePoint.toString());
        System.out.println();

        Circle circle = new Circle(1.0);
        double square;
        square=circle.getArea();
        System.out.println(circle.toString());
        System.out.println("Square of the circle: " + square);
        System.out.println();

        RectangleNew rectangleNew = new RectangleNew(1.0,1.0);
        System.out.println("Perimetr of the rectangle = "+rectangleNew.getPerimetr());

    }
}
