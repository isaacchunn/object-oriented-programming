import java.util.Scanner;

public class P3 {

    public static void printHeader() {
        System.out.println("");
        // Print out header first
        System.out.println("US$ \t S$");
        for (int i = 0; i < 11; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting value: ");
        int startingValue = scanner.nextInt();
        System.out.println("Ending Value: ");
        int endingValue = scanner.nextInt();
        // Check the bounds
        if (endingValue < startingValue) {
            System.out.println("Input error!");
            return;
        }
        // Safe to ask for incremental value
        System.out.println("Increment: ");
        int increment = scanner.nextInt();

        // Start generating the tables

        // For loop version
        printHeader();
        for (int i = startingValue; i <= endingValue; i += increment) {
            System.out.println(i + " \t " + (double) i * 1.82);
        }

        // While version
        printHeader();
        int count = startingValue;
        while (count <= endingValue) {
            System.out.println(count + " \t " + (double) count * 1.82);
            count += increment;
        }

        // Do while version
        printHeader();
        count = startingValue;
        do {
            System.out.println(count + " \t " + (double) count * 1.82);
            count += increment;
        } while (count <= endingValue);
    }
}
