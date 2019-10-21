package dependencyInversionPrinciple;

public class DatabaseHandler {

    private Database database;

    public DatabaseHandler(MySQLDatabase mySQLDatabase) {
        this.database = new MySQLDatabase();
    }

    public void connect() {
        this.database.connect();
    }

    public void disconnect() {
        this.database.disconnect();
    }
}
