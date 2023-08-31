package Tutorial.Tutorial3.Shapes;

public class Circle extends Point {

    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + getRadius() + ", Area: " + area();
    }
}
