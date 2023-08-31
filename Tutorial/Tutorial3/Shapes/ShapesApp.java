package Tutorial.Tutorial3.Shapes;

public class ShapesApp {
    public static void main(String[] args) {
        // Test circle and see how it works
        Circle circle = new Circle(0, 0, 2);
        circle.setRadius(5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(0, 0, 5, 10);
        cylinder.setHeight(2);
        System.out.println(cylinder);
    }
}
