#pragma once

#include "Animal.h"

class Mammal : public Animal
{
	public:
		Mammal();
		Mammal(string name, COLOR color);
		~Mammal();

		//In order for mammal class to not be abstract, especially for move
		//Not overriding pure virtual functions makes the derived class abstract itself, hence overriding is needed 
		void eat() const;
		void move() const;

	private:
};

