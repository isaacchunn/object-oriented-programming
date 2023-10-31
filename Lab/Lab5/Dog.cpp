//
//  Dog.cpp
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#include "Dog.h"

Dog::Dog()
: Mammal()
{
    
}

Dog::Dog(string name, COLOR color, string owner)
:   Mammal(name, color),
    owner(owner)
{
    
}

Dog::~Dog()
{
    
}

void Dog::move() const
{
    cout << "Dog move" << endl;
}

void Dog::speak() const
{
    cout << "Woof" << endl;
}

void Dog::eat() const
{
    cout << "Dog eat" << endl;
}
