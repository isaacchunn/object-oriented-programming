package PastYearPaper.Sem120192020;

public abstract class ClassB extends ClassA {
    public abstract void transmit(int i, int j, int k);
    public void transmit(int i, int j)
    {
        System.out.println("Override A from B");
    }
    public abstract void transmit(String s, int i);

}
