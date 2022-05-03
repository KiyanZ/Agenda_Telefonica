
import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class FileContactProvider implements IContactsProvider{

    public static final String FIELD_SPLITTER = ";";
    public static final String AGENDA_RESOURCES_CONTACTS_TXT = "/home/INFORMATICA/alu10467008/Escriptori/agenda/resources/contacts.txt";

    @Override
    public List<Contact> loadContacts() throws IOException {
        List<Contact> contactslist = new LinkedList<>();
        FileReader fileReader = new FileReader(AGENDA_RESOURCES_CONTACTS_TXT);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] contacts;
        do {
            try {
                contacts = bufferedReader.readLine().split(FIELD_SPLITTER);
                contactslist.add(new Contact(Integer.parseInt(contacts[0]), contacts[1], contacts[2], contacts[3], contacts[4]));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (bufferedReader.readLine() != null );
        return null;
    }

    private void saveContacts(List<Contact> contacts){
        int i = 0;

        try (PrintWriter pw = new PrintWriter(new FileWriter(AGENDA_RESOURCES_CONTACTS_TXT))){
                for (Contact contact:contacts){
                    String contactString = stringFromContact(contact, i++);
                    pw.println(contactString);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String stringFromContact(Contact contact, int id){
        return (id) + FIELD_SPLITTER +contact.getName()+ FIELD_SPLITTER +contact.getPhoneNumber()+ FIELD_SPLITTER +contact.getAddress()+ FIELD_SPLITTER +contact.getEmail();
    }

    @Override
    public void add(Contact contact) throws IOException {
        List<Contact> contacts = loadContacts();
        loadContacts().add(contact);
        saveContacts(contacts);
    }

    @Override
    public void remove(Contact contact) {
        List<Contact> contacts = null;
        try {
            contacts = loadContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        contacts.remove(contact);
        saveContacts(contacts);

    }

    @Override
    public void update(Contact contact) {
        List<Contact> contacts = null;
        try {
            contacts = loadContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        contacts.remove(contact);
        contacts.add(contact);
        saveContacts(contacts);
    }
}
