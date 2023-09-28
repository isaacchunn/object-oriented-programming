package PastYearPaper.Sem120222023;

public abstract class ClassA {
    public abstract void print(String s);
    public abstract void print(String s, int x);
    public void print(int x, String s)
    {
        System.out.println("ClassA print");
    }
}
