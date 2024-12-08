import java.util.List;

public interface SearchInPhoneBook {
    public abstract List<PersonClass> SearchFirstName(String name);
    public abstract List<PersonClass> SearchLastName(String lastName);
    public abstract List<PersonClass> SearchStreet (String street);
    public abstract List<PersonClass> SearchAll(String name);
    public abstract List<Integer> whichIDs();


}
