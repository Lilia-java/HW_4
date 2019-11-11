public class MovablePointNew implements Movable{
    int x1;
    int y1;
    int x2;
    int y2;
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePointNew(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePointNew(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePointNew() {
    }

    @Override
    public String toString() {
        return "MovablePointNew{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(){
        //x =+ xSpeed;
        x = x;
        y =+ ySpeed;
    }
    public void moveDown(){
        //x =+ xSpeed;
        x = x;
        y =- ySpeed;
    }
    public void moveLeft(){
        x =- xSpeed;
        y = y;
        //y =+ ySpeed;
    }
    public void moveRight(){
        x =+ xSpeed;
        y = y;
        //y =+ ySpeed;
    }

}
