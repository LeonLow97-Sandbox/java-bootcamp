package models;
import java.util.ArrayList;

public class ContactManager {

    ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) {
        return new Contact(contacts.get(index));
    }

    public void setContacts(int index, Contact contact) {
        this.contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact) {
        this.contacts.add(new Contact(contact));
    }

    public void removeContact(String contactName) {
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
