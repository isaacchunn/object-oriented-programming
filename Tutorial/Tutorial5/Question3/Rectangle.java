package Tutorial.Tutorial5.Question3;

public class Rectangle extends Polygon{
    public Rectangle()
    {
        super();
    }
    public Rectangle(String theName, float theWidth, float theHeight)
    {
        super(theName,theWidth,theHeight);
        //Set poly type
        this.polyType = KindOfPolygon.POLY_RECT;
    }

    public float calcArea()
    {
        return width * height;
    }
}
