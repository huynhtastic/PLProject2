package huynh.business;

/**
 * Created by Richard Huynh on 2/17/2016.
 */
public abstract class Person {

    // member fields
    private String firstName;
    private String lastName;
    private String email;

    // no param constructor
    public Person() {}

    // get methods
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getEmail() { return this.email; }

    // set methods
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nEmail: %s", this.firstName, this.lastName, this.email);
    }

    public abstract String getDisplayText();
}
