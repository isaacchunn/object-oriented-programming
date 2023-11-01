//
//  Mammal.h
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#ifndef MAMMAL_H
#define MAMMAL_H

#include "Animal.h"

class Mammal : public Animal
{
private:
public:
    Mammal();
    Mammal(string n, COLOR c);  //3.2c
    ~Mammal();                  //3.2d
    
    //In order for mammal class to not be abstract, especially for move
    //Not overriding pure virtual functions makes the derived class abstract itself, hence overriding is needed 
    void move() const;
    //For zoo question, remove virtual to get the mammal eat behaviour
    //I am choosing to use the overriden implementations
    virtual void eat() const;
};

#endif /* MAMMAL_H */
