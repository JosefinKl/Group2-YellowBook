import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogIn {
    public LogIn() {

    }

    String user;
    public void StartLogIn(PhoneBook phonebook, List<PersonClass> phonebooklist) {


        while(true){
        System.out.println("Do you want to continue as Guest (G) or Admin (A)?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

            if(choice.equalsIgnoreCase("G")){
                user = "Guest";
                System.out.println("Guest");
                Search search = new Search(phonebook);
                while(true) {
                    System.out.println("What to do next? (S - new search, Quit - quit)");
                    String newInput = sc.nextLine();
                    if (newInput.equalsIgnoreCase("S")) {
                        Search search1 = new Search(phonebook);
                    }else if (newInput.equalsIgnoreCase("Quit")) {
                        break;
                    }
                    else {
                        System.out.println("Invalid input");
                    }
                }
                break;

            }else if(choice.equalsIgnoreCase("A")) {
                AdministratorList a = new AdministratorList();
                a.setAdminList();
                while(true){
                    System.out.println("Add User Name");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.nextLine();

                    if (a.isAdmin(name)){
                              //is part of list of admins
                        while(true) {
                            System.out.println("Add Password");
                            Scanner sc2 = new Scanner(System.in);
                            String password = sc2.nextLine();
                            if (a.isAdminPassword(password)) { //Equals
                                user = "Admin";
                                System.out.println("You are logged in.");

                                adminMenu(phonebook, phonebooklist);
                                return;
                            } else {
                                System.out.println("Incorrect Password");
                            }
                        }
                    }else {
                        System.out.println("Invalid Username");
                    }
                }
            }else {
                System.out.println("Invalid Choice");


            }
        }
    }

    private void adminMenu(PhoneBook phoneBook, List<PersonClass> phonebooklist) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View all profiles");
            System.out.println("2. Edit an existing profile");
            System.out.println("3. Delete an existing profile");
            System.out.println("4. Add a profile");
            System.out.println("5. Download a phone book");
            System.out.println("6. Search");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();



                switch (choice) {
                    case 1: // View all profiles
                        System.out.println("List of profiles:");
                        // Print out the entire list
                        System.out.println("\nLista över alla personer:");


                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }
                        break;

                    case 2: // Edit an existing profile
                        System.out.println("\nLista över alla personer:");


                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }

                        System.out.println("Write ID for person to edit:");
                        Integer id = sc.nextInt();

                        PersonClass person = phoneBook.SearchAndDeleteID(id);
                        System.out.println("\nLista över alla personer:");


                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }

                        EditClass editClass = new EditClass(person, phoneBook, phonebooklist);
                        editClass.editPerson(phonebooklist);
                        phoneBook.savePhoneBookToFile();

                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }

                        break;

                    case 3:
                        System.out.println("\nLista över alla personer:");


                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }

                        System.out.println("Write ID for person to delete:");
                        Integer id2 = sc.nextInt();

                        PersonClass person2 = phoneBook.SearchAndDeleteID(id2);
                        System.out.println("\nLista över alla personer:");
                        phoneBook.savePhoneBookToFile();

                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");

                        }

                        break;

                    case 4:
                        AddPerson addPerson = new AddPerson();
                        List<Telephone> phoneNumbers = new ArrayList<>();
                        phoneNumbers.add(new Telephone(46, 730721234));
                        addPerson.AddNewPerson(phoneBook, phonebooklist);
                        phoneBook.savePhoneBookToFile();
                        for (PersonClass p : phoneBook.getPhoneBook()) {
                            System.out.println(p);
                            System.out.println("-------------------------");
                        }
                        break;
                    case 5:
                        System.out.println("Downloading phonebook...");
                        phoneBook.downloadPhoneBook();

                        break;
                    case 6:
                        Search search1 = new Search(phoneBook);
                        break;
                    case 7: // Quit
                        System.out.println("Quit");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid Choice");
                sc.nextLine(); // Consume newline

            }
        }
    }
}
