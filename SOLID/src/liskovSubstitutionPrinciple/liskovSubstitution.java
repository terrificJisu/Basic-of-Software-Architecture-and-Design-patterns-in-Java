package liskovSubstitutionPrinciple;

/**
 *
 *  L -> LISKOV SUBSTITUTION PRINCIPLE
 *
 *  --------------------------------------------------------------------------------
 *
 *  What is the motivation of Liskov principle?
 *      We usually create class hierarchies during the application development
 *          For example: we extend some classes creating some derived classes !!!
 *
 *          It would be great if the new derived classes would work as well
 *          without replacing the functionality of the classes
 *
 *          Otherwise, the new classes can produce undesired effects when they are
 *          used in existing program modules
 *
 *  ---------------------------------------------------------------------------------
 *
 *   - Child classes should never break the parent class type definition
 *
 *   - Let q(x) be a property provable about objects x of type T. Then q(y) should be
 *     provable for objects y of type S where S is subtype of T
 *
 *   - Subtype must be substitutable for their base types
 *     ( derived types must be completely substitutable for their base types )
 *
 *     We have to make sure there will be no problems using the subtype or the original
 *     class
 *      Do not break functionality !!! We can call the methods anyway
 *
 *   - We can solve it with the help of Template Pattern
 *   - It is not independent from Open Close Principle + interface segregation principle
 *      The violation of Liskov principle is a latent violation of Open Closed Principle !!!
 *
**/

public class liskovSubstitution {
}
