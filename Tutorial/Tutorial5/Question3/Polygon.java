package Tutorial.Tutorial5.Question3;

public abstract class Polygon {
    public enum KindOfPolygon {POLY_PLAIN, POLY_RECT, POLY_TRIANG};
    protected String name;
    protected float width;
    protected float height;
    protected KindOfPolygon polyType;

    public Polygon()
    {
        name = "Polygon";
        width = 1;
        height = 1;
        polyType = KindOfPolygon.POLY_PLAIN;
    }

    public Polygon(String theName, float theWidth, float theHeight)
    {
        name = theName;
        width = theWidth;
        height = theHeight;
        polyType = KindOfPolygon.POLY_PLAIN;
    }

    public KindOfPolygon getPolyType()
    {
        return polyType;
    }

    public void setPolyType(KindOfPolygon value)
    {
        polyType = value;
    }
    public String getName() { return name;}
    public abstract float calcArea();
    public void printWidthHeight() {
        System.out.println("Width = " + width + " Height = " + height);
    }

}
