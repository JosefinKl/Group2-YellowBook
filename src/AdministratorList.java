import java.util.ArrayList;
import java.util.List;

public class AdministratorList {
    List<Administrator> adminList = new ArrayList<>();
    public List<Administrator> setAdminList() {

        Administrator admin1 = new Administrator("Josefin", 1234);
        Administrator admin2 = new Administrator("Eric", 1234);
        Administrator admin3 = new Administrator("Holy", 1234);
        adminList.add(admin1);
        adminList.add(admin2);
        adminList.add(admin3);
        //System.out.println((adminList));
        return adminList;

    }

    public boolean isAdmin(String userInput){

        for (Administrator admin : adminList){

            if(admin.getName().equals(userInput) ){

                return true;
            }
        }

        return false;
    }

    public boolean isAdminPassword(String userInput){

        for (Administrator admin : adminList){

            if(Integer.toString(admin.getPassword()).equals(userInput)){
                return true;
            }
        }

        return false;
    }



}
