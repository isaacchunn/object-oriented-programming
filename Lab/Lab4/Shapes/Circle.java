package Lab4.Shapes;

public class Circle implements Shape{

    //Instance variables
    protected double radius;

    //Constructors
    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double calcArea()
    {
        //Area of circle is pi r^2
        return (Math.PI * Math.pow(this.radius,2));
    }
    @Override
    public String toString()
    {
        return "Circle: <Radius: " + this.radius + ">";
    }
}
