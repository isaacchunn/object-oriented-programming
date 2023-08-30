package Lab1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        // Read a character from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character: ");
        // Get the input from user
        String input = scanner.nextLine();
        // Convert lower case to reduce switch statements and repetition since both are
        // accepted
        input = input.toLowerCase();
        // Then extract first character
        char firstChar = input.charAt(0);

        // Switch statement
        switch (firstChar) {
            case 'a': {
                System.out.println("Action movie fan\n");
                break;
            }
            case 'c': {
                System.out.println("Comedy movie fan\n");
                break;
            }
            case 'd': {
                System.out.println("Drama movie fan\n");
                break;
            }
            default: {
                System.out.println("Invalid choice\n");
                break;
            }
        }
    }
}