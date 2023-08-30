#include "Dog.h"

Dog::Dog()
	: Mammal()
{
}

Dog::Dog(string name, COLOR color, string owner)
	: Mammal(name,color), owner(owner)
{
}

Dog::~Dog()
{
}

void Dog::move() const
{
	cout << "Dog moves " << endl;
}

void Dog::speak() const
{
	cout << "Woof" << endl;
}
