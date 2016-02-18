package huynh;

/**
 * Created by Richard Huynh on 2/18/2016.
 */
public class Customer extends Person{

    // member fields
    private String customerNumber;

    // no param constructor
    public Customer() {}

    // get methods
    public String getCustomerNumber() { return this.customerNumber; }

    // set methods
    public void setCustomerNumber(String customerNumber) { this.customerNumber = customerNumber; }

    // abstract method implementation
    @Override
    public String getDisplayText() {
        return String.format("%s\nCustomer Number: %s", this.toString(), this.customerNumber);
    }
}
