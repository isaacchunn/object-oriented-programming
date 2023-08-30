#include "Animal.h"
#include "Mammal.h"
#include "Dog.h"
#include <iostream>

using namespace std;

int main()
{
    //Cannot instantiate abstract class after Qn 4:
    //Animal a = Animal("Test", COLOR::Black);
    //a.speak();

    Animal* animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->speak();
    animalPtr->move();

    Mammal m = Mammal("Mammal", COLOR::Blue);
    m.speak();

    Dog d = Dog("Snoggy", COLOR::White, "Xin Ying");
    d.speak();
    d.move();
    cout << "Program exiting..." << endl;

    delete animalPtr;
    return 0;
}

