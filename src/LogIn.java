import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogIn {
    public LogIn() {
    }

    public void StartLogIn(){
        while(true){
        System.out.println("Do you want to continue as Guest (G) or Admin (A)?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

            if(choice.equals("G")){
                System.out.println("Guest");
                break;

            }else if(choice.equals("A")) {
                while(true){
                    System.out.println("Add User Name");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.nextLine();
                    if (name.equals("xxx")) {  //is part of list of admins
                        while(true) {
                            System.out.println("Add Password");
                            Scanner sc2 = new Scanner(System.in);
                            String password = sc2.nextLine();
                            if (password.equals("xx")) { //Equals
                                System.out.println("You are logged in.");
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

    List<String> adminlist = new ArrayList<String>();


}