package problem2;
public class Demo {

    public static void main(String[] args) {
    System.out.println("");
    Point point1 =  new Point(1.2f, 1.4f);
    System.out.println("point 1: "+point1);
    MovablePoint movablePoint1 = new MovablePoint(3.8f, 8.6f, 3.9f, 2.6f);
    System.out.println("Before move: " + movablePoint1);
    movablePoint1.move();
    System.out.println("MovablePoint1 (after move): " + 
            String.format("(%1$.1f, %2$.1f), speed=(%3$.1f, %4$.1f)", 
            movablePoint1.getX(), movablePoint1.getY(), movablePoint1.getXSpeed(), movablePoint1.getYSpeed()));
    System.out.println("");

    }

}
