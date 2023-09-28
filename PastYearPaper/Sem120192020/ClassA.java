package PastYearPaper.Sem120192020;

public abstract class ClassA {
    public abstract void transmit(int i, int j);

    public void transmit(int i, String s) {
        System.out.println("Transmit int string in A");
    }

}
