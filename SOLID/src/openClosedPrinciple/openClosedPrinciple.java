package openClosedPrinciple;

/**
 *
 *  O -> OPEN / CLOSED PRINCIPLE
 *
 *   ---------------------------------------------------------------------------------
 *   What is the MOTIVATION behind SOLID principles?
 *      An application should take care of the frequent changes that are done
 *          during the development and the maintaining phase of an application
 *              For example: new functionalities have to be added !!!
 *
 *          Those changes in the existing code should be minimized
 *              WHY? It's assumed that the existing code is already unit tested and
 *                   changes in already written code might affect the existing functionality in an unwanted manner.
 *  ---------------------------------------------------------------------------------
 *
 *   Open closed principle states that design and writing of the coe should be done in a way
 *   that new functionality should be added with minimum changes in the existing code
 *      WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE !!!!!!
 *
 *      - Software entities should be open for extension, but closed for modification
 *          We have to design every new module -> if we add a new behaviour, we do not
 *                                                have to change the existing modules
 *
 *      - Closely related to the single responsibility principle !!!
 *
 *      - A class should not extend an other class explicitly
 *          We should have a common interface
 *              WHY? Because we can change the classes at runtime due to the common interface !!!
 *
 *              For example: we want to show a progress dialog but it can due to some download or
 *                           landing of some music etc ...
 *                           We want to decide at runtime why we want to show the dialog
 *
 *      - We can make sure this principle is not violated:
 *          1.) Strategy pattern
 *          2.) Template pattern
 *
 * */

public class openClosedPrinciple {
}
