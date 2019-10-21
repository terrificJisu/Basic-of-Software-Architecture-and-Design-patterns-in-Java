# Basic of Software Architecture and Design patterns
## Programming language: Java

SOLID principles and design patterns

```
SOLID principles
Design patterns
Object oriented design
```


 *  S <--> SINGLE RESPONSIBILITY PRINCIPLE
 ```
 
    A software entity (class, method) should have only on reason to change
    If a class or a method does more than one procedure,
       it is advisable to separate it into two distinct classes/methods
    It can be done easily with the help of interfaces !!!
 
    So, if we have 2 reasons to change for a class -> we should split the functionality
       into two separate classes
           EACH CLASS WILL HANDLE A SINGLE RESPONSIBILITY !!!
 
    It leads to a low coupled design with less and lighter dependencies
```

 *  O -> OPEN / CLOSED PRINCIPLE
 ```
    ---------------------------------------------------------------------------------
    What is the MOTIVATION behind SOLID principles?
       An application should take care of the frequent changes that are done
           during the development and the maintaining phase of an application
               For example: new functionalities have to be added !!!
 
           Those changes in the existing code should be minimized
               WHY? It's assumed that the existing code is already unit tested and
                    changes in already written code might affect the existing functionality 
                    in an unwanted manner.
   ---------------------------------------------------------------------------------
 
    Open closed principle states that design and writing of the coe should be done in a way
    that new functionality should be added with minimum changes in the existing code
       WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE !!!!!!
 
       - Software entities should be open for extension, but closed for modification
           We have to design every new module -> if we add a new behaviour, we do not
                                                 have to change the existing modules
 
       - Closely related to the single responsibility principle !!!
 
       - A class should not extend an other class explicitly
           We should have a common interface
               WHY? Because we can change the classes at runtime due to the common interface !!!
 
               For example: we want to show a progress dialog but it can due to some download or
                            landing of some music etc ...
                            We want to decide at runtime why we want to show the dialog
 
       - We can make sure this principle is not violated:
           1.) Strategy pattern
           2.) Template pattern
```

 *  L -> LISKOV SUBSTITUTION PRINCIPLE
 ```
   --------------------------------------------------------------------------------
 
   What is the motivation of Liskov principle?
       We usually create class hierarchies during the application development
           For example: we extend some classes creating some derived classes !!!
 
           It would be great if the new derived classes would work as well
           without replacing the functionality of the classes
 
           Otherwise, the new classes can produce undesired effects when they are
           used in existing program modules
 
   ---------------------------------------------------------------------------------
 
    - Child classes should never break the parent class type definition
 
    - Let q(x) be a property provable about objects x of type T. Then q(y) should be
      provable for objects y of type S where S is subtype of T
 
    - Subtype must be substitutable for their base types
      ( derived types must be completely substitutable for their base types )
 
      We have to make sure there will be no problems using the subtype or the original
      class
       Do not break functionality !!! We can call the methods anyway
 
    - We can solve it with the help of Template Pattern
    - It is not independent from Open Close Principle + interface segregation principle
       The violation of Liskov principle is a latent violation of Open Closed Principle !!!
```
I -> INTERFACE SEGREGATION PRINCIPLE SOLID
```
   -----------------------------------------------------------------------------
 
   What is the motivation?
       We can have an abstraction of the system using interfaces
 
       List<String> 1 = new ArrayList<>();
 
           Sometimes --> we want to implement that but just for the sake
               of some methods defined in  by that interface
                   BUT we have to implement all the methods
                                   "fat interfaces"
 
   -----------------------------------------------------------------------------
 
   - It is about business logic to clients communication - It is not good if
       an interface contains logs of methods
           We should separate them accordingly
 
   - The interface-segregation principle (ISP) states that no client should be
       forced to depend on methods it does not use !!!
 
   - When we can, we should break our interface in many smaller ones, so they
       better satisfy the exact needs of our clients
```
D -> DEPENDENCY INVERSION PRINCIPLE

```
   ----------------------------------------------------------------------------------------------
 
   What is the MOTIVATION?
 
   When we develop a software or an application
       First we create the low level modules --> bluetooth communication. XML parser, disk access,
                                                 database connection.
       Second ---> we implement the high level modules that rely heavily on the low level ones
 
                   HIGH LEVEL MODULES
                           ^
                           |
                           |
                   LOW LEVEL MODULES
 
                 THIS IS THE INTUITION ... BUT ITS NOT GOOD
 
                 What if we want to replace a low level module? We have to change the whole high level
                                                                implementation as well.
                                                  For example: connect to Oracle instead of MySQL OR
                                                               want to store data in XML instead of CSV.
 
                 Conclusion: high level modules should not depend on low level modules
                        We have to use abstraction an an abstract layer between the low and high level modules.
 
              <HIGH LEVEL MODULES <---> ABSTRACT LAYER (INTERFACES) <---> LOW LEVEL MODULES !!!
 
   ----------------------------------------------------------------------------------------------
 
   - Very difficult to apply: but it is the most important principle.
 
   - High level modules should not depend on low level modules...
       Both should depend on abstraction !!!
        Abstraction should not depend on detail...
         Details should depend upon abstraction !!!
 
           Dog dog = new Dog();
           create Animal interface
           Animal dog = new Dog();  
```

```
   MVC Pattern: we can separate the application with the help of this pattern
     Why is it good? if we want to add extra features it can be done very very very easily !!!
     
      - Model: represents an object or a class carrying data.
               It can also have logic to update controller if its data changes.
               
      - Controller: acts on both model and view
                    It controls the data flow into model object and 
                     updates the view whenever data changes.
                    It keeps view and model separate.
             
      - View: represents the visualization of the data that model contains
            
            MODEL < --- > CONTROLLER < --- > VIEW
```
