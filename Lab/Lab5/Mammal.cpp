//
//  Mammal.cpp
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#include "Mammal.h"

Mammal::Mammal()
: Animal()
{
    
}

Mammal::Mammal(string n, COLOR c)
: Animal(n,c)
{
    
}

Mammal::~Mammal()
{
    
}

void Mammal::move() const
{
    cout << "Mammal move " << endl;
}

void Mammal::eat() const
{
    cout << "Mammal eat " << endl;
}


