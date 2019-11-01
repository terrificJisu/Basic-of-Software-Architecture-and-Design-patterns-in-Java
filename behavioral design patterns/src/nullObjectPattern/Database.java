package nullObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> customerNames;

    public Database() {
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Daniel");
        this.customerNames.add("Joseph");
        this.customerNames.add("John");
        this.customerNames.add("Issac");
    }

    public boolean existCustomer(String name) {
        for(String s : customerNames) {
            if(s.equals(name)){
                return true;
            }
        }

        return false;
    }

}
