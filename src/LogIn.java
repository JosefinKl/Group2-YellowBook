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
//                                while(true) {
//                                    System.out.println("What to do next? (S - new search, E - edit in phonebook, " +
//                                            "D - delete person in phonebook, A - add person in phoneboook, Quit - quit)");
//                                    String newInput = sc2.nextLine();
//                                    if(newInput.equalsIgnoreCase("S")) {
//                                        Search search1 = new Search();
//                                    }else if (newInput.equalsIgnoreCase("E")) {
//                                        //TODO run editfunction
//                                    }else if (newInput.equalsIgnoreCase("D")) {
//                                        //TODO run Deletefunction
//                                    }else if (newInput.equalsIgnoreCase("A")) {
//                                        //TODO run addfunction
//                                    }else if (newInput.equalsIgnoreCase("Quit")) {
//                                        break;
//                                    }else {
//                                     System.out.println("Invalid input");
//                                    }
//                                }

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
            System.out.println("3. Edit an delete profile");
            System.out.println("4. Edit an add profile");

            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // View all profiles
                    System.out.println("List of profiles:");
                    // Print out the entire list
                    System.out.println("\nLista över alla personer:");
                    List<PersonClass> personList = new ArrayList<>();
                    for (PersonClass p : personList) {
                        System.out.println(p);
                        System.out.println("-------------------------");
                    }
                    break;

                case 2: // Edit an existing profile
                    System.out.println("\nLista över alla personer:");
                    List<PersonClass> personList = new ArrayList<>();
                    for (PersonClass p : personList) {
                        System.out.println(p);
                        System.out.println("-------------------------");
                    }
                    break;
                    System.out.println("Write ID for person to edit:");
                    Integer id = sc.nextInt();

                    EditClass editClass = new EditClass();
                    break;



                case 3: // Logout
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



}
