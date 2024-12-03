import java.util.Scanner;

public class Search {
    public Search(){
        System.out.println("What do you want to search for (F - first name, L - last name, A - Adress, S - Search in all, C - close)?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        while (true) {
            if (choice.equalsIgnoreCase("F")) {
                PhoneBook pb = new PhoneBook();
                System.out.println("First name to search for:");
                Scanner sc = new Scanner(System.in);
                String firstnameInput = sc.nextLine();
                pb.SearchFirstName(firstnameInput);
                return;
            } else if (choice.equalsIgnoreCase("L")) {
                PhoneBook pb = new PhoneBook();
                System.out.println("Last name to search for:");
                Scanner sc = new Scanner(System.in);
                String lastNameInput = sc.nextLine();
                pb.SearchLastName(lastNameInput);
                System.out.println("L");
            } else if (choice.equalsIgnoreCase("A")) {
                System.out.println("A");
            } else if (choice.equalsIgnoreCase("S")) {
                System.out.println("Search");
            } else if (choice.equalsIgnoreCase("C")) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }

    }

}
