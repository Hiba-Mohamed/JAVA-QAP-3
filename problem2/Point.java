package problem2;
public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
    }

    public float  getX(){
        return this.x;
    }
    public float  getY(){
        return this.y;
    }
      public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

   public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString(){
        return "("+this.x + "," + this.y + ")";
    }

    
}
