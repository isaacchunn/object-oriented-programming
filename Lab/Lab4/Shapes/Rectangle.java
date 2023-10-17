package Lab4.Shapes;

public class Rectangle implements Shape{

    //Instance variables
    protected double length;
    protected double breadth;

    //Constructors
    public Rectangle(){
        this.length = 1;
        this.breadth = 1;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //Accessors and mutators
    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calcArea()
    {
        return this.length * this.breadth;
    }

    @Override
    public String toString()
    {
        return "Rectangle: <Length: " + this.length + ", Breadth: " + this.breadth + ">";
    }
}
