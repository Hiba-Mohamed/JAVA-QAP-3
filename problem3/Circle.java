package problem3;

public class Circle extends Ellipse {
    private double radius;
    public Circle (double radius){
        super(radius, radius);
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + String.format("%.2f",this.radius);  // Since majorAxis == minorAxis for a circle
    }
    
}
