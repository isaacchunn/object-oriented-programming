#include "Animal.h"

Animal::Animal()
    : _name("unknown"),
    _color(COLOR::Black)
{
    std::cout << "constructing Animal object " << _name << std::endl;
}
Animal::Animal(string n, COLOR c)
    : _name(n),
    _color(c)
{
    std::cout << "constructing Animal object " << _name << " with color ";
    
    switch (_color) 
    {
        case Green:
            std::cout << "Green" << std::endl;
            break;
        case Blue:
            std::cout << "Blue" << std::endl;
            break;
        case White:
            std::cout << "White" << std::endl;
            break;
        case Black:
            std::cout << "Black" << std::endl;
            break;
        case Brown:
            std::cout << "Brown" << std::endl;
            break;
        default:
            std::cout << "Error!" << std::endl;
            break;
    }       
}
Animal::~Animal()
{
    std::cout << "destructing Animal object " << _name << " with color ";

    switch (_color)
    {
    case Green:
        std::cout << "Green" << std::endl;
        break;
    case Blue:
        std::cout << "Blue" << std::endl;
        break;
    case White:
        std::cout << "White" << std::endl;
        break;
    case Black:
        std::cout << "Black" << std::endl;
        break;
    case Brown:
        std::cout << "Brown" << std::endl;
        break;
    default:
        std::cout << "Error!" << std::endl;
        break;
    }
}

void Animal::speak() const
{
    std::cout << "Animal speaks " << std::endl;
}

void Animal::move() const
{
    std::cout << "Animal moves " << std::endl;
}