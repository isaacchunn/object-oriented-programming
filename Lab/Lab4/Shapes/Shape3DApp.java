package Lab4.Shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    public static void main (String[] args) {
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);
        //Store an array list of shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        int numShapes;
        int choice;
        System.out.println("----- Shape3DApp -----");
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
                System.out.println("1. Cube");
                System.out.println("2. Cuboid");
                System.out.println("3. Sphere");
                System.out.println("4. Pyramid");
                System.out.println("5. Cone");
                System.out.println("6. Cylinder");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();

                //Do boundary checking.
                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid choice! Key again.");
                } else {
                    Shape shapeToCreate = null;
                    switch (choice) {
                        case 1:             /*Cube*/ {
                            System.out.print("Enter length of side: ");
                            double side = scanner.nextDouble();

                            //Create our shape
                            shapeToCreate = new Cube(side);
                            System.out.println("Created a cube with side: " + side);
                            break;
                        }
                        case 2:             /*Cuboid*/ {
                            System.out.print("Enter length of cuboid: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter breadth of cuboid: ");
                            double breadth = scanner.nextDouble();
                            System.out.print("Enter height of cuboid: ");
                            double height = scanner.nextDouble();

                            shapeToCreate = new Cuboid(length, breadth, height);
                            System.out.println("Created a square with length: " + length + ", breadth: " + breadth + ", height: " + height);
                            break;
                        }
                        case 3:             /*Sphere*/ {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();

                            shapeToCreate = new Sphere(radius);
                            System.out.println("Created a sphere with radius: " + radius);
                            break;
                        }
                        case 4:             /*Pyramid*/ {
                            System.out.print("Enter base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter height: ");
                            double height = scanner.nextDouble();

                            shapeToCreate = new Pyramid(base, height);
                            System.out.println("Created a pyramid with base: " + base + " and height: " + height);
                            break;
                        }
                        case 5:             /*Cone*/
                        {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            System.out.print("Enter height: ");
                            double height = scanner.nextDouble();

                            shapeToCreate = new Cone(radius, height);
                            System.out.println("Created a cone with radius: " + radius + " and height: " + height);
                            break;
                        }
                        case 6:             /*Cylinder*/
                        {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            System.out.print("Enter height: ");
                            double height = scanner.nextDouble();

                            shapeToCreate = new Cylinder(radius, height);
                            System.out.println("Created a cylinder with radius: " + radius + " and height: " + height);
                            break;
                        }
                        default:
                            break;
                    }

                    //Add our new shape into the shapeList
                    shapes.add(shapeToCreate);
                }

            } while (choice < 1 || choice > 6);
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
