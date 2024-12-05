 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.loadPhoneBookFromFile();

        List<PersonClass> phonebooklist = phoneBook.getPhoneBook();
        LogIn logIn = new LogIn();
        logIn.StartLogIn(phoneBook, phonebooklist);

        phoneBook.savePhoneBookToFile();




//        Scanner scanner = new Scanner(System.in);
//
//        // Be användaren att ange sina uppgifter
//        System.out.print("Ange ditt förnamn: ");
//        String firstName = scanner.nextLine();
//
//        System.out.print("Ange ditt efternamn: ");
//        String lastName = scanner.nextLine();
//
//        // Hantera flera telefonnummer
//        List<Telephone> telephones = new ArrayList<>();
//        while (true) {
//            System.out.print("Ange landskod (eller 'klar' för att avsluta): ");
//            String input = scanner.nextLine();
//            if (input.equalsIgnoreCase("klar")) {
//                break;
//            }
//            int countryCode = Integer.parseInt(input);
//
//            System.out.print("Ange telefonnummer: ");
//            int number = Integer.parseInt(scanner.nextLine());
//
//            telephones.add(new Telephone(countryCode, number));
//        }
//
//        // Adressuppgifter
//        System.out.print("Ange din gata: ");
//        String street = scanner.nextLine();
//
//        System.out.print("Ange din stad: ");
//        String city = scanner.nextLine();
//
//        System.out.print("Ange ditt postnummer: ");
//        String zipCode = scanner.nextLine();
//
//        Address address = new Address(street, streetNumber, city, zipCode);
//
//        System.out.print("Ange din ålder: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();  // Konsumera newline
//
//        // Skapa PersonClass-objekt
//        PersonClass person = new PersonClass(firstName, lastName, telephones, address, age);
//
//        // Skriv ut personens uppgifter
//        System.out.println("\nHär är dina uppgifter:");
//        System.out.println(person);
//
//        // Skapa och använd EditClass för att redigera personens uppgifter
//        EditClass editor = new EditClass(person);
//        editor.editPerson();
//
//        scanner.close();
    }
}
