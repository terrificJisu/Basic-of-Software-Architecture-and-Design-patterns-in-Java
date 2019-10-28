package strategyPattern;
/**
 *
 *  Very important principle #1 in design -> take what varies and encapsulate it ... and it will not
 *      affect the rest of our code
 *
 *    The code will be much more flexible .. later you can later or extend the parts that vary without
 *      affecting those that does not !!!
 *
 *          code that changes <-------> code that stays the same
 *
 *  Very important principle #2 in design -> program to an interface/supertype not an implementation !!!
 *      Abstract superclass would be perfect too ...
 *          - the actual runtime object is not locked into the code
 *          - the type of variable should be a supertype/interface: can be of any
 *                                                                  concrete implementation
 *
 *         Dog dog = new Dog(); not so good "programming to an implementation"
 *         Animal dog = new Dog() GOOD      "programming to an interface"
 *
 *  Sometimes, it is good to separate behaviors from implementation: easier to reuse it
 *      + We can add new behavior without modifying any of our existing behavior classes !!!
 *          SOLID PRINCIPLE !!!
 *
 *  Very important principle #3 in design -> Favor composition over inheritance !!!
 *
 *    class Book {
 *        private Writer writer;
 *    }
 *
 *    class Book extends Writer {
 *
 *    }
 *
 *      Composition: HAS-A relationship -> it gives you a lot more flexibility
 *          1. You can encapsulate stuffs into their own set of classes
 *          2. YOU CAN CHANGE AT RUNTIME with interfaces
 *              so composition is used in several design patterns
 *
 *      Inheritance: IS-A relationship
 *
 * */
public class strategyPattern {
}
