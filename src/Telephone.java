import java.io.Serializable;

public class Telephone implements Serializable{
    private static final long serialVersionUID = 6544567145938392484L;
    private int countryCode;
    private int number;

    public Telephone(int countryCode, int number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "+" + countryCode + " " + number;
    }
}
