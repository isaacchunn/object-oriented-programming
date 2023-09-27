package PastYearPaper.Sem120212022;

public class Graduate extends Student{
    private CourseComponent assignment;
    private CourseComponent finalExam;
    private CourseComponent researchReport;
    public Graduate(String name, CourseComponent assignment, CourseComponent finalExam, CourseComponent researchReport) {
        super(name);
        this.assignment = assignment;
        this.finalExam = finalExam;
        this.researchReport = researchReport;
    }

    public double calOverall()
    {
        double sum = assignment.getScore() * assignment.getPercentage();
        sum += finalExam.getScore() * finalExam.getPercentage();
        sum += researchReport.getScore() * researchReport.getPercentage();
        return sum;
    }
}
