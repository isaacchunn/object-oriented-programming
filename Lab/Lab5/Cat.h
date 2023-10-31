//
//  Cat.h
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#ifndef CAT_H
#define CAT_H

#include "Mammal.h"

class Cat : public Mammal
{
private:
    std::string owner;
public:
    Cat();
    Cat(std::string name, COLOR color, std::string owner);
    ~Cat();
    
    void speak() const;
    void move() const;
    void eat() const;
};


#endif /* Cat_h */
