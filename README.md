# Head First Design Patterns Study Notes

This is my study notes from the book Head First Design Patterns.

**Strategy Design Pattern**

1. Why don't we have fly and quack methods in the Duck class itself

    Not all ducks (ex RubberDuck, MutedDuck) can fly and or quack. Since these classes extend Duck they inherit the behavior of fly and quack which does not makes sense.
    
2. What is the other option

    We can have interfaces *Flyable* and *Quackable* and have the corresponding ducks implement these interfaces. 
    However this introduces maintenance overhead when new ducks are added. Additionally changing behavior requires more effort
    as each duck has its own fly and quack methods.
    
3. This is where we arrive at Strategy pattern

    Strategy pattern enables us to encapsulate varying things and separate them out from thing that does not change.
    
*Inheritance* - Leads to code reuse

*Interfaces* - Contact definition, code duplication in implementing classes.
