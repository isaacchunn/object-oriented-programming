package PastYearPaper.Sem120212022;

public class Undergraduate extends Student{
    private CourseComponent assignment;
    private CourseComponent finalExam;
    public Undergraduate(String name, CourseComponent assignment, CourseComponent finalExam){
        super(name);
        this.assignment = assignment;
        this.finalExam = finalExam;
    }
    public double calOverall()
    {
        double sum = assignment.getScore() * assignment.getPercentage();
        sum += finalExam.getScore() * finalExam.getPercentage();
        return sum;
    }
}
