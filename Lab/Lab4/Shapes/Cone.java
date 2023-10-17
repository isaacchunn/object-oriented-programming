package Lab4.Shapes;

public class Cone extends Circle{
    private double height;
    public Cone()
    {
        super();
    }

    public Cone(double radius, double height)
    {
        super(radius);
        this.height = height;

    }

    public double calcArea() {
        return Math.PI * super.radius * (super.radius + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2)));
    }

    @Override
    public String toString()
    {
        return "Cone: <Radius: " + this.radius + ", Height: " + this.height + ">";
    }


}
