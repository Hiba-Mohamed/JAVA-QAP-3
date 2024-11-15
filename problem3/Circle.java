package problem3;

public class Circle extends Ellipse {
    private double radius;
    public Circle (double radius){
        super(radius, radius);
        this.name = "Circle";
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + this.radius;  // Since majorAxis == minorAxis for a circle
    }
    
}
