//
//  Lion.cpp
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#include "Lion.h"

Lion::Lion()
: Mammal()
{
    
}

Lion::Lion(std::string name, COLOR color)
:   Mammal(name , color)
{
    
}

Lion::~Lion()
{
    
}

void Lion::move() const
{
    cout << "Lion run" << endl;
}

void Lion::speak() const
{
    cout << "Lion roar" << endl;
}

void Lion::eat() const
{
    cout << "Lion eat" << endl;
}
