#ifndef ANIMAL_H
#define ANIMAL_H

#include <string>
#include <iostream>

using namespace std;

enum COLOR {
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
private:
    std::string _name;
    COLOR _color;

public:
    Animal();
    //2: Overload constructor
    Animal(string n, COLOR c);
    ~Animal();

    //Uncommenting virtual in here makes all subsequent calls call animal speaks instead of overriden 
    virtual void speak() const;
    //Makes animal an abstract class, as a class is abstract if it has at least one pure virtual function
    virtual void move() const = 0;
};

#endif
