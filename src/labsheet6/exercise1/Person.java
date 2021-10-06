package labsheet6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "First name: " + getFirstName() + " Last name: " + getLastName();
    }

    public Person() {
        setName("Not supplied", "Not supplied");
    }

    public Person(String firstName, String lastName) {
        setName(firstName, lastName);
    }
}
