import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditClass {
    private PersonClass person;

    public EditClass(PersonClass person, PhoneBook phoneBook, List<PersonClass> phonebooklist) {
        this.person = person;
    }
    public void editPerson(List<PersonClass> phonebooklist) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Redigerar person: " + person);

        System.out.print("Ange nytt förnamn (eller tryck Enter för att behålla): ");
        String firstName = scanner.nextLine();
        if (!firstName.isEmpty()) {
            person.setFirstName(firstName);
        }

        System.out.print("Ange nytt efternamn (eller tryck Enter för att behålla): ");
        String lastName = scanner.nextLine();
        if (!lastName.isEmpty()) {
            person.setLastName(lastName);
        }

        // Hantera telefonnummer
        System.out.println("Nuvarande telefonnummer: " + person.getTelephone());
        System.out.print("Vill du ändra telefonnummer? (ja/nej): ");
        String changePhone = scanner.nextLine();
        if (changePhone.equalsIgnoreCase("ja")) {
            List<Telephone> telephones = new ArrayList<>();
            while (true) {
                System.out.print("Ange landskod (eller 'klar' för att avsluta): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("klar")) {
                    break;
                }
                int countryCode = Integer.parseInt(input);

                System.out.print("Ange telefonnummer: ");
                int number = Integer.parseInt(scanner.nextLine());

                telephones.add(new Telephone(countryCode, number));
            }
            person.setTelephone(telephones);
        }

        // Hantera adress
        System.out.println("Nuvarande adress: " + person.getAddress());
        System.out.print("Vill du ändra adress? (ja/nej): ");
        String changeAddress = scanner.nextLine();
        if (changeAddress.equalsIgnoreCase("ja")) {
            System.out.print("Ange ny gata: ");
            String street = scanner.nextLine();

            System.out.print("Ange nytt gatunummer: ");
            String streetnumber= scanner.nextLine();

            System.out.print("Ange ny stad: ");
            String city = scanner.nextLine();

            System.out.print("Ange nytt postnummer: ");
            Integer zipCode = Integer.parseInt(scanner.nextLine());

            Address address = new Address(street, streetnumber, city, zipCode);

            person.setAddress(address);
        }

        System.out.print("Ange ny ålder (eller tryck Enter för att behålla): ");
        String ageInput = scanner.nextLine();
        if (!ageInput.isEmpty()) {
            int age = Integer.parseInt(ageInput);
            person.setAge(age);
        }

        System.out.println("Uppdaterade uppgifter: " + person);

    phonebooklist.add(person);


    }
}
