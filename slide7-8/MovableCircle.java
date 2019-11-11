public class MovableCircle implements Movable {
    int radius;
    MovablePointNew center = new MovablePointNew();

    public MovableCircle(MovablePointNew center,int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp(){
        //x =+ xSpeed;
        center.x = center.x;
        center.y = +center.ySpeed;
    }
    public void moveDown(){
        //x =+ xSpeed;

        center.x = center.x;
        center.y = -center.ySpeed;
    }
    public void moveLeft(){
        center.x =- center.xSpeed;
        center.y = center.y;
        //y =+ ySpeed;
    }
    public void moveRight(){
        center.x =+ center.xSpeed;
        center.y = center.y;
        //y =+ ySpeed;
    }
}
