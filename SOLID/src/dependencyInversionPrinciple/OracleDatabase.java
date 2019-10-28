package dependencyInversionPrinciple;

public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connection Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnection Oracle databasae....");
    }
}
