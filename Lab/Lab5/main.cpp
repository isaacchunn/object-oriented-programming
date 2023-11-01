//
//  main.cpp
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#include <iostream>
#include <vector>
#include "Animal.h"
#include "Mammal.h"
#include "Dog.h"
#include "Cat.h"
#include "Lion.h"

int main(int argc, const char * argv[]) {
    //system("pwd");
    //Animal a = Animal("Rabbit", COLOR::White);
    //a.speak();
    Mammal m = Mammal("Whale", Blue);
    m.speak();
    Dog d = Dog("Dog", White, "Isaac");
    d.speak();
    d.move();
    
    //3.3 onwards
    cout << "---3.3---" << endl;
    Animal * animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->speak();
    animalPtr->move();
    
    //3.3.3 onwards
    cout << "---3.3.3---" << endl;
    Dog dogi("Lassie", White, "Andy");
    Mammal * aniPtr = &dogi;
    Mammal &aniRef = dogi;
    Mammal aniVal = dogi;
    
    aniPtr->speak();
    aniRef.speak();
    aniVal.speak();
    
    //Build a zoo -4
    cout <<"---4: Zoo App---" << endl;
    //Initialize our vector
    std::vector<Mammal*> mammals;
    int choice = 0;
    do {
        cout << "Select the animal to send to Zoo: " << endl;
        cout <<"(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit: ";
        cin >> choice;
        switch (choice)
        {
            case 1:
            {
                Dog * dog = new Dog("Dog", White, "Isaac");
                mammals.push_back(dog);
                break;
            }
            case 2:
            {
                Cat * cat = new Cat("Cat", White, "Isaac");
                mammals.push_back(cat);
                break;
            }
            case 3:
            {
                Lion * lion = new Lion("Lion", White);
                mammals.push_back(lion);
                break;
            }
            case 4:
            {
                //Traverse vectors and print out all mammals
                for(int i = 0; i < mammals.size(); i++)
                {
                    mammals[i]->move();
                    mammals[i]->speak();
                    mammals[i]->eat();
                    cout << endl;
                }
                break;
            }
            default:
            {
                break;
            }
        }
    } while (choice != 5);
    
    cout << "Program exiting..." << endl;
    for(int i = 0; i < mammals.size(); i++)
    {
        delete mammals[i];
    }
    delete animalPtr;
    return 0;
}
