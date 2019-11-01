package nullObjectPattern;

public class RealCustomer extends AbstractCustomer {

    private String customerName;

    public RealCustomer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getCustomer() {
        return this.customerName;
    }
}
