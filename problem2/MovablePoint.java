package problem2;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed(){
        return this.xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    
    public float[] getSpeed(){
        return new float []{this.xSpeed, this.ySpeed};
    }

    public MovablePoint move(){
        float x = super.getX();
        float y = super.getY();
        float newX = x+xSpeed;
        float newY = y+ySpeed;
        super.setXY(newX, newY);
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + ", speed=(" + this.xSpeed + ", " + this.ySpeed + ")";
    }
}
