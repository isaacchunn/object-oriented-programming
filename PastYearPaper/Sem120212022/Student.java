package PastYearPaper.Sem120212022;

public abstract class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }
    public abstract double calOverall();
}
