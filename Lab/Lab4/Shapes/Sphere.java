package Lab4.Shapes;

public class Sphere extends Circle{
    public Sphere() {
        super();
    }
    public Sphere(double radius) {
        super(radius);
    }

    public double calcArea()
    {
        //Area is 4 pi r*2
        return  (4 * Math.PI * Math.pow(this.radius,2));
    }

    @Override
    public String toString()
    {
        return "Sphere: <Radius: " + this.radius + ">";
    }
}
