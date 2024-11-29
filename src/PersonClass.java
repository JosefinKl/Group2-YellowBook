 import java.util.List;

public class PersonClass {
    private String firstName;
    private String lastName;
    private List<Telephone> telephone;
    private Address address;
    private int age;

    public PersonClass(String firstName, String lastName, List<Telephone> telephone, Address address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.age = age;
    }

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

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Telephone: " + telephone + "\n" +
               "Address: " + address + "\n" +
               "Age: " + age;
    }
}