package dependencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {

        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase());

        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
