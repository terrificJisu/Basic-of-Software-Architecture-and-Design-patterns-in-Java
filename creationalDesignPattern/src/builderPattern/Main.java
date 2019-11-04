package builderPattern;

/**
 *  WHY TO PREFER BUILDER PATTERN?
 *
 *      - There would be lots of parameters in the constructor ~ hard to follow
 *          Hard not to confuse parameters !!!
 *              ~ setters are the same, not the best solution
 *
 *      - Not extensible: when we have to add one more optional parameters, we have to create a new constructor
 *          Telescoping constructors appear !!!
 *              With a builder --> we just add another method
 *
 *      - Immutable property: we should consider parallel execution
 *          The best is to use objects that can not be modified after they have been created
 *              "immutable objects"
 *             ~so there will not be any problems because of concurrent updates by multiple threads
 *
 * */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Kevin", "kevin@gmail.com").build();
        Person person2 = new Person.Builder("Kevin", "kevin@gmail.com").setAge(15).build();
        System.out.println(person2);

    }
}
