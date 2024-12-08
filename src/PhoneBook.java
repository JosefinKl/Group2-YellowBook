import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;
import java.util.Scanner;
import java.io.IOException;

public class PhoneBook implements SearchInPhoneBook {


    List<PersonClass> PhoneBookList = new ArrayList<PersonClass>();

    public List<PersonClass> getPhoneBook() {
        return PhoneBookList;
    }

    public PhoneBook() {
        // Initialize with soe sample data
        List<Telephone> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new Telephone(46, 730721234));
        phoneNumbers.add(new Telephone(46, 704211234));

        List<Telephone> phoneNumbers2 = new ArrayList<>();
        phoneNumbers2.add(new Telephone(46, 730721884));

        List<Telephone> phoneNumbers3 = new ArrayList<>();
        phoneNumbers3.add(new Telephone(46, 730729984));


        PersonClass person1 = new PersonClass(1, "Adam", "Andersson",
                phoneNumbers,
                new Address("Nyponvägen", "21A", "Karlstad", 12345),
                20);
        PersonClass person2 = new PersonClass(2, "Eva", "Pettersson",
                phoneNumbers2,
                new Address("Skogsvägen", "25", "Karlstad", 12345),
                20);
        PersonClass person3 = new PersonClass(3, "John", "Doe",
                phoneNumbers3,
                new Address("Elm Street", "13B", "Springfield", 54321),
                25);


        PhoneBookList.add(person1);

        PhoneBookList.add(person2);

        PhoneBookList.add(person3);
      //  savePhoneBookToFile();

    }

    List<PersonClass> searchResult = new ArrayList<>();

    public List<PersonClass> SearchFirstName(String name) {
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if (person.getFirstName().contains(name)) {
                searchResult.add(person);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("no match");
        } else {
            System.out.println(searchResult);
        }
        return searchResult;
    }

    public List<PersonClass> SearchLastName(String name) {
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if (person.getLastName().contains(name)) {
                searchResult.add(person);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("no match");
        } else {
            System.out.println(searchResult);
        }
        return searchResult;
    }

    public List<PersonClass> SearchStreet(String name) {
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if (person.getAddress().getStreetName().contains(name)) {
                searchResult.add(person);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("no match");
        } else {
            System.out.println(searchResult);
        }

        return searchResult;
    }

    public PersonClass SearchAndDeleteID(Integer id) {
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if (person.getId().equals(id)) {
                PhoneBookList.remove(person);
                return person;
            }
        }
        return null;

    }

    public List<Integer> whichIDs() {
        List<Integer> listID = new ArrayList<>();
        for (PersonClass person : PhoneBookList) {
            listID.add(person.getId());
        }
        return listID;
    }


    public List<PersonClass> SearchAll(String name) {
        searchResult.clear();
        for (PersonClass person : PhoneBookList) {
            if (person.getAddress().getStreetName().contains(name) || person.getLastName().contains(name) ||
                    person.getFirstName().contains(name) || person.getAddress().getStreetNumber().contains(name) ||
                    person.getAddress().getCity().contains(name) ||
                    toString(person.getAddress().getZipCode()).contains(name) ||
                    toString(person.getAge()).contains(name)) {
                searchResult.add(person);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("no match");
        } else {
            System.out.println(searchResult);
        }
        return searchResult;
    }

    private String toString(int integer) {
        return integer + "";
    }




    // Save the PhoneBookList to a file
    public void savePhoneBookToFile() {
        File file = new File("phonebook.dat");
        System.out.println("Saving Phonebook to: " + file.getAbsolutePath());
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phonebook.dat"))) {
            out.writeObject(PhoneBookList); // Write the list of PersonClass objects to the file
            System.out.println("PhoneBook saved to file.");
            System.out.println("Total people saved: " + PhoneBookList.size());
        } catch (IOException e) {
            System.err.println("Error saving phonebook: " + e.getMessage());
        }
    }



    // Load the PhoneBookList from a file
    public void loadPhoneBookFromFile() {
        File file = new File("phonebook.dat");
        System.out.println("Phonebook file path: " + file.getAbsolutePath()); // Print file path

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("No phonebook file found. Starting with empty list.");
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("phonebook.dat"))) {
            PhoneBookList = (List<PersonClass>) in.readObject(); // Read the list of PersonClass objects from the file
            System.out.println("PhoneBook loaded from file.Total people: " + PhoneBookList.size());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading phonebook: " + e.getMessage());
        }
    }
    public void downloadPhoneBook() {
        Scanner scanner = new Scanner(System.in);
        File sourceFile = new File("phonebook.dat");

        // Check if the file exists in the current directory
        if (!sourceFile.exists()) {
            System.out.println("The phonebook file does not exist.");
            return;
        }

        // Ask user for the destination directory
        System.out.println("Please enter the destination directory where you want to save the phonebook file:");
        System.out.println("See example for the destination directory: C:/Users/YourUsername/Downloads");
        String destinationDir = scanner.nextLine();

        // Create a File object for the destination
        File destinationFile = new File(destinationDir + File.separator + "phonebook.dat");

        try {
            // Copy the file to the user-specified directory
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("The phonebook has been successfully downloaded to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error downloading phonebook: " + e.getMessage());
        }
    }

}


