package Lab4.Shapes;

public class Cube extends Square{

    public Cube()
    {
        super();
    }
    public Cube(double side)
    {
        super(side);
    }

    public double calcArea()
    {
        return (6 * super.calcArea());
    }

    @Override
    public String toString()
    {
        return "Cube: <Side: " + this.side + ">";
    }
}
