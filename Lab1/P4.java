package Lab1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height: ");
        int height = scanner.nextInt();

        scanner.close();
        if (height <= 0) {
            System.out.println("height = 0 - Error input!!");
            return;
        }
        int flip = 1;
        String out = "";
        for (int i = 0; i < height; i++) {
            // += can be inefficient as it makes a new string and copies it since string is
            // immutable
            if (flip == 1) {
                out = "AA" + out;
            } else {
                out = "BB" + out;
            }
            System.out.println(out);
            // Invert flip using multiplication
            flip *= -1;
        }
    }
}
