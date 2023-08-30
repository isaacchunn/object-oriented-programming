package Lab1;

import java.util.Scanner;

//Quite unsure what the question really wants?
public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salary: ");
        int salary = scanner.nextInt();
        System.out.println("Merit Points: ");
        int meritPoints = scanner.nextInt();
        // Write the most demanding condition first
        if (salary >= 700) {
            if (salary <= 799 && meritPoints < 20)
                System.out.println("Grade B");
            else
                System.out.println("Grade A");
        } else if (salary >= 600) {
            // If the salary is < 649 and
            if (salary <= 649 && meritPoints < 10)
                System.out.println("Grade C");
            else
                System.out.println("Grade B");

        } else if (salary >= 500) {
            System.out.println("Grade C");
        } else {
            System.out.println("No grade applicable for this salary.");
        }
    }
}
