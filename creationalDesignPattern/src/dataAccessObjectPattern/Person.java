package dataAccessObjectPattern;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

}
