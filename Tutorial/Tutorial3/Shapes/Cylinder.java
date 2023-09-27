package Tutorial.Tutorial3.Shapes;

//Cylinder inherits from circle as a cylinder is a circle's area * an arbitrary height
public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        this(0, 0, 1, 1);
    }

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = 1;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double volume() {
        return super.area() * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Volume: " + volume();
    }

}
