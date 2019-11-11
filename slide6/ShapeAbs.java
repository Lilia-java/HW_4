public abstract class ShapeAbs {
    String color;
    boolean filled;

    public ShapeAbs() {
    }

    public ShapeAbs(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        if (color == null){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public abstract double getArea();
    public abstract double getPerimetr();
}
