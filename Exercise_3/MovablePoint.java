package Exercise_3;

public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "";
    }

    @Override
    public void moveUp(){}

    @Override
    public void moveDown(){}

    @Override
    public void moveLeft(){}

    @Override
    public void moveRight(){}
    
}
