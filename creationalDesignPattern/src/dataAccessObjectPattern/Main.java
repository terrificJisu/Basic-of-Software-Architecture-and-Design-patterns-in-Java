package dataAccessObjectPattern;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Person jay = new Person("Jay", 32);

        database.insert(new Person("John", 22));
        database.insert(jay);
        database.insert(new Person("Josh", 42));

        for (Person person : database.getPeople()) {
            System.out.println(person);
        }

        database.remove(jay);

        for (Person person : database.getPeople()) {
            System.out.println(person);
        }
    }

}
