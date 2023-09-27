package Tutorial.Tutorial5.Question1and2;

public class ClassApp {
    public static void main (String[] args)
    {
        ClassF z = new ClassF();
        z.print(9);
        z.print(2,"CX2002");
        z.print("Object");
        z.print("OODP","Java");

        ClassA a = new ClassF();
        ClassC f = (ClassC)a;
        f.print(88,"there");

    }
}
