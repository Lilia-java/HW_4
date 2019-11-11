public class MovableRectangle  implements Movable {
    MovablePointNew topLeft = new MovablePointNew();
    MovablePointNew bottomRight = new MovablePointNew();
    /*int x1;
    int y1;
    int x2;
    int y2;
    int xSpeed;
    int ySpeed;*/

    public MovableRectangle(MovablePointNew topLeft, MovablePointNew bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.x1 = topLeft.x1;
        topLeft.y1 =+ topLeft.ySpeed;
        bottomRight.x2 = bottomRight.x2;
        bottomRight.y2 =+ bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.x1 = topLeft.x1;
        topLeft.y1 =- topLeft.ySpeed;
        bottomRight.x2 = bottomRight.x2;
        bottomRight.y2 =- bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x1 =- topLeft.xSpeed;
        topLeft.y1 = topLeft.y1;
        bottomRight.x2 =- bottomRight.xSpeed;
        bottomRight.y2 = bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x1 =+ topLeft.xSpeed;
        topLeft.y1 = topLeft.y1;
        bottomRight.x2 =+ bottomRight.xSpeed;
        bottomRight.y2 = bottomRight.y2;
    }

}
