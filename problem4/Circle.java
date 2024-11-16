package problem4;

public class Circle extends Ellipse {
    public Circle (double radius){
        super(radius, radius);
        this.name = "Circle";
    }


    @Override
    public String toString() {
        return super.toString() + ", radius: " + String.format("%.2f",this.majorAxis);  // Since majorAxis == minorAxis for a circle
    }
    
}
