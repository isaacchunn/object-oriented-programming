package Tutorial.Tutorial2;

public class Circle {
    private double radius; // radius of circle
    private static final double PI = 3.14159;

    // constructor
    public Circle(double rad) {
        this.radius = rad;
    }

    // Mutator method - set radius
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // Accessor method - get radius
    public double getRadius() {
        return this.radius;
    }

    // Calculate area
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    // Calculate circumference
    public double circumference() {
        return (2 * Math.PI) * radius;
    }

    // Print area
    public void printArea() {
        System.out.println("Area of circle");
        System.out.println("Radius: " + this.radius);
        System.out.printf("Area: %.5f\n", area());
    }

    // Print circumference
    public void printCircumference() {
        System.out.println("Circumference of circle");
        System.out.println("Radius: " + this.radius);
        System.out.printf("Circumference: %.4f\n", circumference());
    }
}
