package PastYearPaper.Sem220202021;

public class TestClass {
    private double price;
    private String name;
    static int numberOfProduct = 0;

    //Definition of TestClass constructor
    public TestClass(double price, String name) {
        this.price = price;
        this.name = name;
        numberOfProduct++;
    }

    public static void greetings()
    {
        System.out.println("Hello, welcome to our product line.");
    }
    public void update(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println(name + ": costs S$" + price);
    }

    public void printNumberOfProduct() {
        System.out.println("number = " + numberOfProduct);
    }
}
