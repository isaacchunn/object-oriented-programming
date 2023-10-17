package Lab4.Shapes;

public class Square implements Shape {

    //Instance variables
    protected double side;

    public Square() {
        this.side = 1;
    }

    //Overloaded constructor
    public Square(double side) {
        this.side = side;
    }

    //Accessors and Mutators
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calcArea()
    {
        return (this.side * this.side);
    }

    @Override
    public String toString()
    {
        return "Square: <Side: " + side + ">";
    }

}
