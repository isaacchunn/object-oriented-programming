package PastYearPaper.Sem220202021;

public class TestClassApp {
    public static void main (String[] args)
    {
        TestClass.greetings();
        TestClass myObject = new TestClass(0.0, "Amazing");
        myObject.print();
        myObject.update(999.99, "AmazingII");
        myObject.print();
        myObject.printNumberOfProduct();
        TestClass tomProduct = new TestClass(0.0,"Tom");
        tomProduct.printNumberOfProduct();

    }
}
