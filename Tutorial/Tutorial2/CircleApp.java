package Tutorial.Tutorial2;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        // Print out the menu and inititialize scanner
        Scanner scanner = new Scanner(System.in);
        Circle circle = null;
        int choice = 0;
        do {
            System.out.println("==== Circle Computation ====");
            System.out.println("|1. Create a new circle\t   |");
            System.out.println("|2. Print Area\t\t   |");
            System.out.println("|3. Print circumference\t   |");
            System.out.println("|4. Quit\t\t   |");
            System.out.println("============================");
            System.out.println("Choose option (1-3): ");
            // Get the user choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the radius to compute the area and circumference");
                    int radius = scanner.nextInt();
                    if (radius > 0) {
                        // Its a valid circle
                        circle = new Circle(radius);
                        System.out.println("A new circle is created");
                    } else {
                        System.out.println("Invalid radius, try again!");
                    }
                    break;
                }
                case 2: {
                    if (circle != null) {
                        circle.printArea();
                    } else {
                        System.out.println("No circle was created yet!");
                    }
                    break;
                }
                case 3: {
                    if (circle != null) {
                        circle.printCircumference();
                    } else {
                        System.out.println("No circle was created yet!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Thank you!!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice! Choose an option between 1-4!");
                    break;
                }
            }

        } while (choice != 4);

        scanner.close();
    }

}
