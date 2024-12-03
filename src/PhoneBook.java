import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PersonClass> PhoneBook = new ArrayList<PersonClass>();
    public PhoneBook() {
        PersonClass person1 = new PersonClass("Adam", "Andersson", new ArrayList<>(),new Address(),20 );
        PhoneBook.add(person1);
        PersonClass person2 = new PersonClass("Eva", "Pettersson", new ArrayList<>(),new Address(),20 );
        PhoneBook.add(person2);
        System.out.println(PhoneBook.toString());
    }
}
