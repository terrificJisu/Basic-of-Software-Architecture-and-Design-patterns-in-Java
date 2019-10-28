package interfaceSegregationPrinciple;

/**
 *
 *  I -> INTERFACE SEGREGATION PRINCIPLE SOLID
 *
 *  ----------------------------------------------------------
 *
 *  What is the motivation?
 *      We can have an abstraction of the system using interfaces
 *
 *      List<String> 1 = new ArrayList<>();
 *
 *          Sometimes --> we want to implement that but just for the sake
 *              of some methods defined in  by that interface
 *                  BUT we have to implement all the methods
 *                                  "fat interfaces"
 *
 *  ----------------------------------------------------------
 *
 *  - It is about business logic to clients communication - It is not good if
 *      an interface contains logs of methods
 *          We should separate them accordingly
 *
 *  - The interface-segregation principle (ISP) states that no client should be
 *      forced to depend on methods it does not use !!!
 *
 *  - When we can, we should break our interface in many smaller ones, so they
 *      better satisfy the exact needs of our clients
 *
 * */

public class interfaceSegregation {
}
