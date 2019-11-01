package nullObjectPattern;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
        return "No customer with the given name exists in the database...";
    }
}
