package nullObjectPattern;

/**
 *
 *  Null Object Pattern
 *
 *   - Motivation: reference may be null !!!
 *   - It can be very elaborate to deal with null references
 *   - We have to check whether a reference is null or not -> NullPointerException
 *      if we call methods on null objects
 *
 *   GOOD TO AVOID NULL REFERENCES,
 *      For example: return empty ArrayList instead of null ...
 *                   Or we have to use several if() checks whether the reference is null
 *                   For example: dealing with binary trees
 *
 *                   class Node {
 *                       private int data;
 *                       private Node leftChild;
 *                       private rightChild;
 *
 *                       ...
 *                   }
 *
 *   SOLUTION: the null object design pattern
 *
 *      We create an abstract class specifying various operations to be done
 *          Concrete classes extending this class and a null object class providing
 *              do nothing implementation of this class
 *                  ~ this approach can be used where we need to check null value !!!
 *
 * */

public class Main {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Joseph").getCustomer());
        System.out.println(customerFactory.getCustomer("Jisu").getCustomer());

    }
}
