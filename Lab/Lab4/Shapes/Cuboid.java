package Lab4.Shapes;

public class Cuboid extends Rectangle {
    //3d dimension
    private double height;
    public Cuboid()
    {
        super();
    }

    public Cuboid (double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double calcArea() {
        //lateral area = 2h(l+w)
        double lateralArea = (2 * this.height) * (this.length + this.breadth);
        double baseArea = super.calcArea();
        // Get area of base
        return (2 * baseArea  + lateralArea);
    }

    @Override
    public String toString()
    {
        return "Cuboid: <Length: " + this.length + ", Breadth: " + this.breadth + ", Height: " + this.height +  ">";
    }
}
