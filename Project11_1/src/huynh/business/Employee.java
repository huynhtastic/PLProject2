package huynh.business;

/**
 * Created by Richard Huynh on 2/19/2016.
 */
public class Employee extends Person {

    // member fields
    private String socialSecurityNumber;

    // no param constructor
    public Employee() {
        socialSecurityNumber = "";
    }

    // get methods
    public String getSocialSecurityNumber() { return this.socialSecurityNumber; }

    // set methods
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

    // abstract method implementation
    @Override
    public String getDisplayText() {
        return String.format("%s\nSocial security number: %s", this.toString(), this.socialSecurityNumber);
//        return String.format("Name: %s\nEmail: %s\nSocial security number: %s", )
    }
}
