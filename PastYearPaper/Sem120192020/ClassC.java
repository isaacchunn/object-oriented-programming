package PastYearPaper.Sem120192020;

public class ClassC extends ClassA implements InterfaceA{
    public void transmit(int i, int j)
    {
        System.out.println("Implement Abstract A from C");
    }
    public void transmit(String s, int i)
    {
        System.out.println("Transmit string int in C");
    }
    public void transmit(String s)
    {
        System.out.println("Transmit string in C");
    }
}
