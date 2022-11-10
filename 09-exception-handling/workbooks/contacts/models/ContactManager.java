package models;
import java.util.ArrayList;

public class ContactManager {

    ArrayList<Contact> contacts;

    public ContactManager() {
        // The constructor does't receive any parameters (don't need to check for unchecked exceptions.)
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) {
        return new Contact(contacts.get(index));
    }

    public void setContact(int index, Contact contact) {
        // setContact should not check for null as it would already throw a NullPointerException
        this.contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact) {
        // addContact should not check for null as it would already throw a NullPointerException
        this.contacts.add(new Contact(contact));
    }

    public void removeContact(String contactName) {
        // removeContact should not check for null as it would already throw a NullPointerException
        // removeContact needs the IllegalStateException. If the contacts ArrayList is empty, then the manager is not in 
        // a valid state to call the removeContact method.
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(contactName)) {
                this.contacts.remove(i);
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.contacts.size(); i++) {
            temp += this.contacts.get(i).toString();
            temp += "\n\n";
        }

        return temp;
    }
    
}
