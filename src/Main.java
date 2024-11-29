import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LogIn logIn = new LogIn();
        logIn.StartLogIn();

        List<Administrator> adminList = new ArrayList<>();
        Administrator admin1 = new Administrator("Josefin", 1234);
        Administrator admin2 = new Administrator("Eric", 1234);
        Administrator admin3 = new Administrator("Holy", 1234);
        adminList.add(admin1);
        adminList.add(admin2);
        adminList.add(admin3);
        System.out.println((adminList));
    }

}