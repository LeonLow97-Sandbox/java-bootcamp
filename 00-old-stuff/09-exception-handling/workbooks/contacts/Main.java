import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {

    static ContactManager manager = new ContactManager();
    public static void main(String[] args) {
        
        // try {
        //     // Contact contact = new Contact("Leon", "07/23/1912", "98765432");
        //     // System.out.println(contact.toString());
        //     manager.addContact(new Contact("Leon", "9438502435", "07/23/1912"));
        //     manager.addContact(new Contact("Daniel", "328942394", "08/23/1943"));
        //     manager.addContact(new Contact("Ron", "93028409234", "09/12/2003"));
        //     manager.removeContact("Ron");
        //     System.out.println(manager);
        // } catch (ParseException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Process Complete");
        // }

        try {
            loadContacts("contacts.txt");
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(manager);
            manageContacts();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */
    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();
            if (response.equals("a")) {
               System.out.print("\tName: ");
               String name = scan.nextLine();
               System.out.print("\tPhone Number: ");
               String phoneNumber = scan.nextLine();
               System.out.print("\tBirth Date: ");
               String birthDate = scan.nextLine();
               if (name.isBlank() || phoneNumber.isBlank() || phoneNumber.length() < 5) {
                   System.out.println("\nThe input you provided is not valid. Registration failed.");
               } else {
                   try {
                       manager.addContact(new Contact(name, phoneNumber, birthDate));
                   } catch (ParseException e) {
                       System.out.println(e.getMessage());
                   } finally { //contacts will re-print regardless of the outcome...
                        System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                   }
               }
            } else if (response.equals("b")) {
                System.out.println("\nWho would you like to remove?");
                manager.removeContact(scan.nextLine());
                System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);

            } else {
                break;
            }
        }
        scan.close();

    }


    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */
    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scan = new Scanner(fis);
        while (scan.hasNextLine()) {
            try {
                Contact contact = new Contact(scan.next(), scan.next(), scan.next());
                manager.addContact(contact);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

}