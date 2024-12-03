public class PhoneClass {
    private int countryCode;
    private int number;

    public PhoneClass(int countryCode, int number) {
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
