package strategyPattern;

public class Main {
    public static void main(String[] args) {
    Manager manager = new Manager();

    manager.setStrategy(new Add());
    manager.operation(1, 3);
    }
}
