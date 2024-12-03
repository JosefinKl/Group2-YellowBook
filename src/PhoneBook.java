import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PersonClass> PhoneBookList = new ArrayList<PersonClass>();
    public PhoneBook() {
        PersonClass person1 = new PersonClass("Adam", "Andersson", new ArrayList<>(),new Address(),20 );
        PhoneBookList.add(person1);
        PersonClass person2 = new PersonClass("Eva", "Pettersson", new ArrayList<>(),new Address(),20 );
        PhoneBookList.add(person2);
        //System.out.println(PhoneBookList.toString());
    }

    public List<PersonClass> SearchFirstName(String name){
        List<PersonClass> searchResult = new ArrayList<>();
        for (PersonClass person : PhoneBookList) {
            if(person.getFirstName().equals(name)){
                searchResult.add(person);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }

    public List<PersonClass> SearchLastName(String name){
        List<PersonClass> searchResult = new ArrayList<>();
        for (PersonClass person : PhoneBookList) {
            if(person.getLastName().equals(name)){
                searchResult.add(person);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }

}

