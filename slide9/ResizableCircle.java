public class ResizableCircle extends Circle1 implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
        radius = (radius * percent / 100.0) + radius;
    }
}
