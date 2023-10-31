//
//  Animal.h
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#ifndef ANIMAL_H
#define ANIMAL_H

#include <iostream>
#include <string>

using namespace std;

enum COLOR {
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal {
private:
    string _name;
    COLOR _color;
public:
    Animal();
    Animal(string n, COLOR c); //Overload the animal constructor 2a
    virtual ~Animal();
    
    //Uncommenting virtual in here makes all subsequent calls call animal speaks instead of overriden
    virtual void speak() const;
    //Declare the move function in Animal class as a pure method
    virtual void move() const = 0;
};

#endif /* ANIMAL_H */
