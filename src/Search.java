import java.util.Scanner;

public class Search {
    public Search(PhoneBook phonebook){
        System.out.println("What do you want to search for (F - first name, L - last name, A - Adress Street name, S - Search in all, C - close)?");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        while (true) {
            if (choice.equalsIgnoreCase("F")) {

                System.out.println("First name to search for:");
                Scanner sc = new Scanner(System.in);
                String firstnameInput = sc.nextLine();
                phonebook.SearchFirstName(firstnameInput);
                return;
            } else if (choice.equalsIgnoreCase("L")) {

                System.out.println("Last name to search for:");
                Scanner sc = new Scanner(System.in);
                String lastNameInput = sc.nextLine();
                phonebook.SearchLastName(lastNameInput);
                return;
            } else if (choice.equalsIgnoreCase("A")) {

                System.out.println("Street name to search for:");
                Scanner sc = new Scanner(System.in);
                String streetNameInput = sc.nextLine();
                phonebook.SearchStreet(streetNameInput);
                return;

            } else if (choice.equalsIgnoreCase("S")) {

                System.out.println("What to search for:");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                phonebook.SearchAll(input);
                return;

            } else if (choice.equalsIgnoreCase("C")) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }

    }

}
