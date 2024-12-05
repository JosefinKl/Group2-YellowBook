import java.io.Serializable;

public class Address  implements Serializable {
    private static final long serialVersionUID = 6544567145938392484L;
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
    public String toDataString() {
        return streetName + "," + streetNumber + "," + city + "," + zipCode;
    }


    // method return a string in a text form

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
