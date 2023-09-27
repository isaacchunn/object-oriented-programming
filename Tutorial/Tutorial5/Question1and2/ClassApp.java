package Tutorial.Tutorial5.Question1and2;

import java.util.Scanner;

public class ClassApp {

    public static void main (String[] args)
    {

        ClassA aASd = new ClassF();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Animal a = null;
        Dog d = new Dog();
        if(choice == 1)
        {
            a = new Cat();
        }
        else if(choice == 2)
        {
            a = new Dog();
        }
        else if (choice == 3)
        {
            a = new Pup();
        }

        playWithAnimal(a);

        System.out.println("It is an instance of dog: " + checkDog(a));
        System.out.println("It is a dog: " + d.isDog(a));

        Dog doggy = new Pup();
        if(doggy instanceof Pup)
        {
            Pup pup = (Pup)doggy; //downcast safely
            pup.minixiaogou();
        }

    }

    public static void playWithAnimal(Animal animal)
    {
        animal.play();
        animal.speak();
    }

    /*
                    Animal
                    /     \
                   Dog    Cat
                  /
                 Pup

     */

    //Check if its really a dog and no one else
    public static boolean checkDog(Animal animal)
    {
        if(animal == null)
            return false;

        if(animal instanceof Dog) //instance of means, the class itself, or its predecessor will return true
        {
            Dog dog = (Dog)animal;
            return true;
        }

        else
            return false;
    }
}
