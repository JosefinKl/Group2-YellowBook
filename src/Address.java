public class Address {
    private String streetName;
    private String streetNumber;
    private String city;
    private int zipCode;

    public Address(String streetName, String streetNumber, String city, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public String getCity() {
        return city;
    }
    public int getZipCode() {
        return zipCode;
    }
}
