package problem4;

public abstract class Shape implements Scalable {
    //Each shape should have a name, 
    protected String name;

    public Shape(String name){
        this.name = name;
    };
    //a method to compute its perimeter, 
    public abstract double computePerimeter();

    //and another method to compute its area.
    public abstract double computeArea();

        @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + String.format("%.2f",computeArea()) + ", Perimeter: " + String.format("%.2f",computePerimeter());
    }

}
