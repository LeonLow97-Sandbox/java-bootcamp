import java.text.ParseException;
import java.util.ArrayList;

import models.Contact;
import models.ContactManager;

public class Main {
    public static void main(String[] args) {
        
        try {
            // Contact contact = new Contact("Leon", "07/23/1912", "98765432");
            // System.out.println(contact.toString());
            ContactManager manager = new ContactManager();
            manager.addContact(new Contact("Leon", "07/23/1912", "9438502435"));
            manager.addContact(new Contact("Daniel", "08/23/1943", "328942394"));
            manager.addContact(new Contact("Ron", "09/12/2003", "93028409234"));
            manager.removeContact("Ron");
            System.out.println(manager);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Complete");
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

}
