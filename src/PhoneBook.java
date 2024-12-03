import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PersonClass> PhoneBookList = new ArrayList<PersonClass>();
    public PhoneBook() {
        PersonClass person1 = new PersonClass("Adam", "Andersson", new ArrayList<>(),new Address("Nyponvägen","21A","Karlstad",12345),20 );
        PhoneBookList.add(person1);
        PersonClass person2 = new PersonClass("Eva", "Pettersson", new ArrayList<>(),new Address("Skogsvägen","25","Karlstad",12345),20 );
        PhoneBookList.add(person2);
        //System.out.println(PhoneBookList.toString());
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
}

