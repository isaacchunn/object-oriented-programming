package Tutorial.Tutorial5.Question3;

public class TestPolygon {
    public static void main (String[] args)
    {
        Rectangle rect = new Rectangle("Rect",5,10);
        TestPolygon tp = new TestPolygon();
        tp.printArea(rect);

        Triangle triangle = new Triangle("Triangle", 5,5);
        tp.printArea(triangle);
    }

    //Overloaded methods
    /*
    public double printArea(Rectangle r)
    {
        System.out.println("Rectangle func called");
        //package access so can access protected
        return r.width * r.height;
    }
    public double printArea(Triangle t)
    {
        System.out.println("Triangle func called");
        //package access so can access protected
        return 0.5 * t.width * t.height;
    }
    */



    //Dynamic binding method with no abstract calArea yet
    public double printArea(Polygon p)
    {
        double result = p.calcArea();
        System.out.println(result);
        return result;
    }

}
