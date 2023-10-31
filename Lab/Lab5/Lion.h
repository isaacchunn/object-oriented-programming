//
//  Lion.h
//  Lab5
//
//  Created by Isaac on 31/10/23.
//

#ifndef LION_H
#define LION_H

#include "Mammal.h"

class Lion : public Mammal
{
private:
public:
    Lion();
    Lion(std:: string name, COLOR color);
    ~Lion();
    
    void eat() const;
    void speak() const;
    void move() const;
};


#endif /* LION_H */
