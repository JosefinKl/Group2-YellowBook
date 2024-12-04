import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PersonClass> PhoneBookList = new ArrayList<PersonClass>();
    public List<PersonClass> getPhoneBook() {
        return PhoneBookList;
    }
    public PhoneBook() {
        List<Telephone> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new Telephone(46, 730721234));
        phoneNumbers.add(new Telephone(46, 704211234));

        List<Telephone> phoneNumbers2 = new ArrayList<>();
        phoneNumbers2.add(new Telephone(46, 730721884));

        List<Telephone> phoneNumbers3 = new ArrayList<>();
        phoneNumbers3.add(new Telephone(46, 730729984));


        PersonClass person1 = new PersonClass(1,"Adam", "Andersson",
                phoneNumbers,
                new Address("Nyponvägen","21A","Karlstad",12345),
                20 );
        PersonClass person2 = new PersonClass(2,"Eva", "Pettersson",
                phoneNumbers2,
                new Address("Skogsvägen","25","Karlstad",12345),
                20 );
        PersonClass person3 = new PersonClass(3,"John", "Doe",
                phoneNumbers3,
                new Address("Elm Street", "13B", "Springfield", 54321),
                25);



        PhoneBookList.add(person1);

        PhoneBookList.add(person2);

        PhoneBookList.add(person3);
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
    public PersonClass SearchAndDeleteID(Integer id){
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if(person.getId().equals(id)){
                PhoneBookList.remove(person);
                return person;
            }
        }
        return null;

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

