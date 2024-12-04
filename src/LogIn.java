import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogIn {
    public LogIn() {
    }

    String user;
    public void StartLogIn(){
        while(true){
        System.out.println("Do you want to continue as Guest (G) or Admin (A)?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

            if(choice.equalsIgnoreCase("G")){
                user = "Guest";
                System.out.println("Guest");
                Search search = new Search();
                while(true) {
                    System.out.println("What to do next? (S - new search, Quit - quit)");
                    String newInput = sc.nextLine();
                    if (newInput.equalsIgnoreCase("S")) {
                        Search search1 = new Search();
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
                                adminMenu();
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

    private void adminMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View all profiles");

            System.out.println("2. Edit an existing profile");
            System.out.println("3. Delete an existing profile");
            System.out.println("4. Add a profile");

            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            PhoneBook phoneBook = new PhoneBook();

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
                    PhoneBook pb = new PhoneBook();
                    PersonClass person = pb.SearchID(id);
                    EditClass editClass = new EditClass(person);
                    editClass.editPerson();
                    break;

                case 3:
                    System.out.println("\nDelete an existing profile");
                    for (PersonClass p : phoneBook.getPhoneBook()) {
                        System.out.println(p);
                        System.out.println("-------------------------");
                    }

                    System.out.println("Write ID for person to edit:");
                    Integer id2 = sc.nextInt();
                    PhoneBook pb2 = new PhoneBook();
                    PersonClass person2 = pb2.SearchID(id2);
                    //Add delete function

                case 4:
                    System.out.println("\nDelete an existing profile");
                    for (PersonClass p : phoneBook.getPhoneBook()) {
                        System.out.println(p);
                        System.out.println("-------------------------");
                    }

                    System.out.println("Write ID for person to edit:");
                    Integer id3 = sc.nextInt();
                    PhoneBook pb3 = new PhoneBook();
                    PersonClass person3 = pb3.SearchID(id3);
                    //Add add function
                case 5: // Logout
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



}
