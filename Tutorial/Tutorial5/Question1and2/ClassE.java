package Tutorial.Tutorial5.Question1and2;

public class ClassE extends ClassC{
    @Override
    public void print(String x, String y) {
        System.out.println("Class E print implements C");
    }

    public void print(String x)
    {
        System.out.println("Class E print");
    }
}
