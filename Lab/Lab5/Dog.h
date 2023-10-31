//
//  Dog.h
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#ifndef DOG_H
#define DOG_H

#include "Mammal.h"

class Dog : public Mammal
{
private:
    std::string owner;
    
public:
    Dog();
    Dog(string name, COLOR color, string owner);
    ~Dog();
    
    void eat() const;
    void move() const;
    //Override the speak method for Dog to "Woof"
    void speak() const;
    
};
#endif /* DOG_H */
