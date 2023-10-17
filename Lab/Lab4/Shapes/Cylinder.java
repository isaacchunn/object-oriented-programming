package Lab4.Shapes;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calcArea() {
        return (2 * Math.PI * super.radius * this.height) + (2 * Math.PI * Math.pow(this.radius,2));
    }

    @Override
    public String toString()
    {
        return "Cylinder: <Radius: " + this.radius + ", Height: " + this.height + ">";
    }
}
