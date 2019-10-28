package dependencyInversionPrinciple;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connection to a MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting MySQL database...");
    }
}
