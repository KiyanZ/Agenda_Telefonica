import java.util.Iterator;

public class Agenda {
    private Contact[] contacts;

    public Agenda(int size) {
        this.contacts = new Contact[size];
    }

    public Agenda() {
        this.contacts = new Contact[5];
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public void listContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i]);
            }
        }
    }

    public void removeContact(Contact contact) {
        for (int i = 0; )
    }
}
