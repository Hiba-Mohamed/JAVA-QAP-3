package problem3;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;}
        else{
            System.out.println("");
            System.out.println("Please enter valid sides that form a triangle");
            System.exit(1);  // Terminate the program if invalid
            System.out.println("");
        }
    }


    @Override
    public double computeArea(){
        double s = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(s * (s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double computePerimeter(){
        double p = this.side1+this.side2+this.side3;
        return p;
    }

    @Override
    public String toString(){
        return super.toString() + ", side 1: " + String.format("%.2f",this.side1) + ", side 2: " + String.format("%.2f",this.side2) + ", side 3: " + String.format("%.2f",this.side3);
    }
}
