package Lab4.Shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
    public static void main (String[] args) {
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);
        //Store an array list of shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        int numShapes;
        int choice;
        System.out.println("----- Shape2DApp -----");
        do {
            System.out.print("Enter the total number of shapes: ");
            numShapes = scanner.nextInt();
            if (numShapes <= 0) {
                System.out.println("Number of shapes cannot be 0 or negative!");
            }
        } while (numShapes <= 0);

        //Once we have guaranteed our number of shapes is at least 1.
        for (int i = 0; i < numShapes; i++) {
            do {
                System.out.println("Choose your shape for shape " + (i + 1) + ": ");
                System.out.println("1. Square");
                System.out.println("2. Rectangle");
                System.out.println("3. Circle");
                System.out.println("4. Triangle");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();

                //Do boundary checking.
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice! Key again.");
                } else {
                    Shape shapeToCreate = null;
                    switch (choice) {
                        case 1:             /*Square*/ {
                            System.out.print("Enter length of side: ");
                            double side = scanner.nextDouble();

                            //Create our shape
                            shapeToCreate = new Square(side);
                            System.out.println("Created a square with side: " + side);
                            break;
                        }
                        case 2:             /*Rectangle*/ {
                            System.out.print("Enter length of rectangle: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter breadth of rectangle: ");
                            double breadth = scanner.nextDouble();

                            shapeToCreate = new Rectangle(length, breadth);
                            System.out.println("Created a square with length: " + length + " and breadth: " + breadth);
                            break;
                        }
                        case 3:             /*Circle*/ {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();

                            shapeToCreate = new Circle(radius);
                            System.out.println("Created a circle with radius: " + radius);
                            break;
                        }
                        case 4:             /*Triangle*/ {
                            System.out.print("Enter base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter height: ");
                            double height = scanner.nextDouble();

                            shapeToCreate = new Triangle(base, height);
                            System.out.println("Created a triangle with base: " + base + " and height: " + height);
                            break;
                        }
                        default:
                            break;
                    }

                    //Add our new shape into the shapeList
                    shapes.add(shapeToCreate);
                }

            } while (choice < 1 || choice > 4);
        }

        System.out.println("Successfully created " + numShapes + " shapes.");

        do {
            System.out.println("---Shape Playground---");
            System.out.println("1. Calculate area for specific shape");
            System.out.println("2. Calculate area of all shapes");
            System.out.println("3. Quit");
            System.out.print("Input choice: ");
            choice = scanner.nextInt();
            if (choice <= 0) {
                System.out.println("Invalid choice. Key in again.");
            } else {
                switch (choice) {
                    case 1: {
                        int shapeNumber;
                        PrintShapes(shapes);
                        while(true) {
                            System.out.print("Input number to calculate area for shape (1 for first shape): ");
                            shapeNumber = scanner.nextInt();
                            if (shapeNumber < 1 || shapeNumber > shapes.size()) {
                                System.out.println("Invalid shape selected!");
                            } else {
                                double area = shapes.get(shapeNumber-1).calcArea();
                                System.out.println("Area of the shape was: " + area);
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        double sumArea = 0;
                        for (int s = 0; s < numShapes; s++) {
                            sumArea += shapes.get(s).calcArea();
                        }
                        System.out.printf("Total area is %.3f\n", sumArea);
                        break;
                    }
                    default:
                        break;
                }
            }
        } while (choice != 3);
    }

    public static void PrintShapes(ArrayList<Shape> shapes)
    {
        System.out.println("---Shapes---");
        for(int i = 0; i < shapes.size(); i++)
        {
            System.out.println( (i+1) + ". " + shapes.get(i));
        }
    }
}
