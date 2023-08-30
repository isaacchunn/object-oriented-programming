#include "Mammal.h"

Mammal::Mammal()
	: Animal()
{
}

Mammal::Mammal(string name, COLOR color)
	: Animal(name, color)
{
}

Mammal::~Mammal()
{
}

void Mammal::eat() const
{
	cout << "Mammal eats " << endl;
}

void Mammal::move() const
{
	cout << "Mammal moves " << endl;
}
