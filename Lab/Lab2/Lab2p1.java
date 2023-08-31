package Lab2;

import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: Multiplication test");
            System.out.println("2: Quotient using division by subtraction");
            System.out.println("3: Remainder using division by subtraction");
            System.out.println("4: Count the number of digits");
            System.out.println("5: Position of a digit");
            System.out.println("6: Extract all odd digits");
            System.out.println("7: Quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    mulTest();
                    break;
                }

                case 2: {
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    System.out.println("Enter divisor: ");
                    int divisor = sc.nextInt();
                    System.out.println(number + " / " + divisor + " = " + divide(number, divisor));
                    break;
                }
                case 3: {
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    System.out.println("Enter divisor: ");
                    int divisor = sc.nextInt();
                    System.out.println(number + " % " + divisor + " = " + modulus(number, divisor));
                    break;
                }
                case 4: {
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    if (number < 0)
                        System.out.println("n : - " + number + " - Error input!!");
                    else
                        System.out.println("n : - " + number + " - count = " + countDigits(number));
                    break;
                }
                case 5: {
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    System.out.println("Enter digit to find: ");
                    int digit = sc.nextInt();
                    System.out.println("position = " + position(number, digit));
                    break;
                }
                case 6: {
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    if (number < 0) {
                        System.out.println("oddDigits = Error input!!");
                    } else
                        System.out.println("oddDigits = " + extractOddDigits(number));
                    break;
                }
                case 7:
                    System.out.println("Program terminating...");
                default:
                    break;
            }

        } while (choice < 7);

        // Close scanner at the end
        sc.close();
    }

    // Method code goes below
    // 3.2
    public static void mulTest() {
        int correct = 0;
        Scanner sc = new Scanner(System.in);
        // Ask students 5 multiplication questions
        for (int i = 0; i < 5; i++) {
            // Random generates a double from 0 - < 1.0, so * 9 and then get the int
            int n1 = (int) (Math.random() * 9) + 1;
            int n2 = (int) (Math.random() * 9) + 1;
            System.out.print("How much is " + n1 + " times " + n2 + "? ");
            int val = sc.nextInt();
            if (val == n1 * n2) {
                correct++;
            }
        }
        System.out.println(correct + " answers out of 5 are correct.");
        sc.close();
    }

    // 3.3
    public static int divide(int m, int n) {
        int quotient = 0;
        // While m - n > m
        while (m - n >= 0) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    // 3.4
    public static int modulus(int m, int n) {
        while (m - n >= 0) {
            m -= n;
        }
        return m;
    }

    // 3.5
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            // divide by 10
            n /= 10;
            count++;
        }
        return count;
    }

    // 3.6
    public static int position(int n, int digit) {
        // Count the amount of digits of this number first
        int position = 1;
        while (n > 0) {
            int digitFromRight = n % 10;
            if (digitFromRight == digit)
                return position;
            // Else we / 10
            n /= 10;
            position++;
            ;
        }
        return -1;
    }

    // 3.7 (td: Find non string implementation!)
    public static long extractOddDigits(long n) {
        String s = "";
        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 == 1)
                s = digit + s;
            n /= 10;
        }
        // Check if empty string
        if (s.equals(""))
            return -1;
        // Then just return the long value of string
        return Long.valueOf(s);
    }
}
