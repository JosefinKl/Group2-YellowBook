import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PersonClass> PhoneBookList = new ArrayList<PersonClass>();
    public PhoneBook() {
        PersonClass person1 = new PersonClass("Adam", "Andersson",
                new ArrayList<Telephone>(123),
                new Address("Nyponvägen","21A","Karlstad",12345),
                20 );
        PersonClass person2 = new PersonClass("Eva", "Pettersson",
                new ArrayList<Telephone>(123),
                new Address("Skogsvägen","25","Karlstad",12345),
                20 );
        PhoneBookList.add(person1);

        PhoneBookList.add(person2);

    }
    List<PersonClass> searchResult = new ArrayList<>();

    public List<PersonClass> SearchFirstName(String name){
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if(person.getFirstName().contains(name)){
                searchResult.add(person);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }

    public List<PersonClass> SearchLastName(String name){
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if(person.getLastName().contains(name)){
                searchResult.add(person);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }

    public List<PersonClass> SearchStreet (String name){
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if(person.getAddress().getStreetName().contains(name)){
                searchResult.add(person);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }
    public List<PersonClass> SearchAll(String name){
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if(person.getAddress().getStreetName().contains(name) || person.getLastName().contains(name) ||
                    person.getFirstName().contains(name) || person.getAddress().getStreetNumber().contains(name) ||
                    person.getAddress().getCity().contains(name) ||
                    toString(person.getAddress().getZipCode()).contains(name) ||
                    toString(person.getAge()).contains(name)) {
                searchResult.add(person);
            }
        }
        if(searchResult.size() == 0){
            System.out.println("no match");
        }
        else {
            System.out.println(searchResult);
        }
        return searchResult;
    }

    private String toString(int integer) {
        return integer + "";
    }
}

