package problem4;

public class Ellipse extends Shape {
    protected  double majorAxis;
    protected  double minorAxis;

    public Ellipse(double firstAxis, double secondAxis ){
        super("Ellipse");
        if (firstAxis >= secondAxis){
        this.majorAxis = firstAxis;
        this.minorAxis = secondAxis;
        }
        else{
        this.majorAxis = secondAxis;
        this.minorAxis = firstAxis;
        }
    }

    @Override
    public double computePerimeter(){
        double difference = majorAxis-minorAxis;
        if (difference == 0.0){
            return Math.PI * 2 * majorAxis;
        }
        else{
            return Math.PI * Math.sqrt((2*(Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2))) - Math.pow((majorAxis- minorAxis), 2)/2 );
        }
    }

    @Override
    public double computeArea(){
        return Math.PI * majorAxis * minorAxis;
    }

    @Override 
    public void scale(double factor){
        this.majorAxis = majorAxis * factor;
        this.minorAxis = minorAxis * factor;
    }

    @Override
    public String toString(){
        if (majorAxis == minorAxis){
            return super.toString();
        }
        else{
        return super.toString() + ", Major Axis: " + String.format("%.2f", majorAxis) + ", Minor Axis: " + String.format("%.2f",minorAxis);}
    }
}
