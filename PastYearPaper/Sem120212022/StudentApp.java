package PastYearPaper.Sem120212022;

public class StudentApp {
    public static void main (String[] args) {
        CourseComponent assignment1 = new CourseComponent("assignment1", 0.25, 70);
        CourseComponent final1 = new CourseComponent("final1", 0.40, 80);
        CourseComponent report = new CourseComponent("report",0.35,90);
        Graduate student1 = new Graduate("John",assignment1,final1,report);

        CourseComponent assignment2 = new CourseComponent("assignment2", 0.40, 70);
        CourseComponent final2 = new CourseComponent("final2", 0.60, 80);
        Undergraduate student2 = new Undergraduate("Jane", assignment2, final2);
        printOverall(student1);
        printOverall(student2);

    }

    public static void printOverall(Student student)
    {
        System.out.println("Score: " + student.calOverall());
    }
}
