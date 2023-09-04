package Tutorial.Tutorial1;

import java.util.Scanner;

public class BubbleSortApp {

    public static void main(String[] args) {
        // Initialize a scanner object
        Scanner scanner = new Scanner(System.in);

        //int[] array = new int[100]; // Unimproved
        int[] array;
        System.out.println("\n\n Enter number of Integer elements to be sorted: ");
        // Get the number of elements
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n\n Enter integer value for element no.%d : ", i + 1);
            array[i] = scanner.nextInt();
        }
        // Close scanner mainly to remove the underline
        scanner.close();

        bubble(array, n);

        System.out.println("\n\n Finnally sorted array is: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.printf("%d ", array[i]);
        }

    }

    // Create another static method
    public static void bubble(int[] arr, int size) {

        // If the variable that controls a for loop is not needed outside of the loop,
        // it’s best to declare the variable in the initialization expression.
        // The names i, j, and k are often used to control for loops;
        // declaring them within the for loop initialization expression limits their
        // life span
        // and reduces errors.
        int temp;
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
