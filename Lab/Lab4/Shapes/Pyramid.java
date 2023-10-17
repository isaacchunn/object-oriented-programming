package Lab4.Shapes;

public class Pyramid extends Triangle {
    public Pyramid()
    {
        super();
    }
    public Pyramid(double base, double height){
        super(base, height);
    }

    public double calcArea()
    {
        double baseArea = Math.pow(super.base,2);
        double triangleArea = super.calcArea();
        return (baseArea + (4 * triangleArea));
    }

    @Override
    public String toString()
    {
        return "Pyramid: <Base: " + this.base + ", Height: " + this.height + ">";
    }
}
