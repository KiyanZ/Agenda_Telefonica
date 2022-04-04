
import java.util.LinkedList;
import java.util.List;

public class Agenda {
    List<Contact> contacts = new LinkedList<Contact>();

    public Agenda() {

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }


    public void listContacts(ContactInfo contactInfo) {
        System.out.println(contacts.toString(contactInfo));
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void loadContacts() {
        contacts.add(new Contact("John", 123456789));
        contacts.add(new Contact("Johnathan ", 123455789));
        contacts.add(new Contact("Kiyan", 123454789));
        contacts.add(new Contact("Jayquan", 123453789));

    }

    public void emptyContacts() {
        contacts.clear();

        }
    }

    public void updateContact(Contact contact){
    }
}
