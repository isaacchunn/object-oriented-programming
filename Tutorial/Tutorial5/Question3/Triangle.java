package Tutorial.Tutorial5.Question3;

public class Triangle extends Polygon{
    public Triangle()
    {
        super();
    }
    public Triangle(String theName, float theWidth, float theHeight)
    {
        super(theName,theWidth,theHeight);
        //Set poly type
        this.polyType = KindOfPolygon.POLY_TRIANG;
    }

    public float calcArea()
    {
        return 0.5f * width * height;
    }
}
