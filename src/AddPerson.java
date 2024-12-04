import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddPerson {
    public List<PersonClass> AddNewPerson(PhoneBook phonebook, List<PersonClass> phonebooklist) {
        List<Integer> existingIDs = phonebook.whichIDs();
        Integer maxExistingID = Collections.max(existingIDs);
        Integer newID = maxExistingID + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add new person");

        System.out.print("Ange förnamn: ");
        String firstNameNewPerson = scanner.nextLine();

        System.out.print("Ange efternamn: ");
        String lastNameNewPerson = scanner.nextLine();
        List<Telephone> telephones = new ArrayList<>();
        System.out.println("Ange landskod: ");
            String input = scanner.nextLine();
            int countryCode = Integer.parseInt(input);

            System.out.print("Ange telefonnummer: ");
            int number = Integer.parseInt(scanner.nextLine());

        telephones.add(new Telephone(countryCode, number));

        System.out.print("Ange gata: ");
        String street = scanner.nextLine();

        System.out.print("Ange gatunummer: ");
        String streetnumber= scanner.nextLine();

        System.out.print("Ange ny stad: ");
        String city = scanner.nextLine();

        System.out.print("Ange nytt postnummer: ");
        Integer zipCode = Integer.parseInt(scanner.nextLine());

        Address addressNewPerson = new Address(street, streetnumber, city, zipCode);

        System.out.print("Ange ålder: ");
        String ageInput = scanner.nextLine();
        int ageNewPerson = Integer.parseInt(ageInput);
        scanner.close();


        PersonClass person = new PersonClass(newID, firstNameNewPerson, lastNameNewPerson, telephones, addressNewPerson, ageNewPerson);
        phonebooklist.add(person);
        return phonebooklist;
    }
}
