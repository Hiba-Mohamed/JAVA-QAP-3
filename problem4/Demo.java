package problem4;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Ellipse(6, 4),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };
        System.out.println("");
        System.out.println("Before scaling: ");

            for (Shape shape : shapes) {
            System.out.println(shape);  // Calls toString() automatically
        }
        System.out.println("");
        for (Shape shape : shapes){
        shape.scale(2);}
        System.out.println("After scaling: ");
        for (Shape shape : shapes) {
            System.out.println(shape);  // Calls toString() automatically
        }
                System.out.println("");

                        System.out.println("");



    }
    
}
