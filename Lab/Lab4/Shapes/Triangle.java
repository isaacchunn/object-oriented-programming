package Lab4.Shapes;

public class Triangle implements Shape{
    protected double height;
    protected double base;

    public Triangle()
    {
        this.height = 1;
        this.base = 1;
    }

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double heightd) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double calcArea() {
        return 0.5 * this.base * height;
    }

    @Override
    public String toString()
    {
        return "Triangle: <Base: " + this.base + ", Height: " + this.height + ">";
    }
}
