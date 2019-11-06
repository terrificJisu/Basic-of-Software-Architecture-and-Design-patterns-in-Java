package serviceLocatorPattern;

/**
 *  It is a design pattern --> It is for obtaining the processes involved in obtaining
 *                             a service with a string abstraction layer
 *
 *          We have a central registry "service locator"
 *
 *          ADVANTAGES
 *              - It is like a run-time linker: allows code to be added at run-time without
 *                                              re-compiling the source code
 *              - can make some optimization
 *                  For example: the application can detect it has a better database
 *                               library than the default one -> alter the registry accordingly
 *
 *         DISADVANTAGES
 *              - black box: harder to detect and recover from errors
 *              - registry hides the dependencies --> causes run-time errors instead of compile-time
 *                                                   ones and we do not like it
 *              - difficult to maintain the registry: dependency injection is more convenient
 *
 *        SERVICE LOCATOR VS DEPENDENCY INJECTION
 *          Both are the just implementations of the dependency inversion principle !!!
 *              ~ so depend upon abstraction rather than on implementation --> loosely couple
 *
 *          - With service locator the application class asks for it explicitly by
 *            a message to the locator
 *          - With injection there is no explicit request, the service appears in the application
 *            class - hence the inversion of control
 *          - Easier to test application with dependency injection
 *          - THE CHOICE IS NOT SO IMPORTANT: THE PRINCIPLE IS IMPORTANT -> WE SHOULD SEPARATE
 *            SERVICE CONFIGURATION FROM THE USE OF SERVICES WITHIN AN APPLICATION
 *
 * */

public class Main {
    public static void maim(String[] args) {
        Service s = ServiceLocator.getService("databaseService");
        s.execute();

        s = ServiceLocator.getService("messagingService");
        s.execute();
    }
}
