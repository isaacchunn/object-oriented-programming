//
//  Cat.cpp
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#include "Cat.h"

Cat::Cat()
:   Mammal()
{
    
}

Cat::Cat(std::string name, COLOR color, std::string owner)
:   Mammal(name, color),
    owner(owner)
{
    
}


Cat::~Cat()
{
    
}

void Cat::speak() const
{
    cout << "Cat meow" << endl;
}

void Cat::move() const
{
    cout << "Cat run" << endl;
}

void Cat::eat() const
{
    cout << "Cat eat" << endl;
}
