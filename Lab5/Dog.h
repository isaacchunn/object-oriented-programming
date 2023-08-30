#pragma once

#include "Mammal.h"

class Dog : public Mammal
{
	private:
		string owner;
	public:
		Dog();
		Dog(string name, COLOR color, string owner);
		~Dog();

		void move() const;
		void speak() const;

};

