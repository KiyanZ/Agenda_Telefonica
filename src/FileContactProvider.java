
import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class FileContactProvider implements IContactsProvider{
    @Override
    public List<Contact> loadContacts() throws IOException {
        List<Contact> contactslist = new LinkedList<>();
        FileReader fileReader = new FileReader("/home/INFORMATICA/alu10467008/Escriptori/agenda/resources/contacts.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] contacts;
        do {
            try {
                contacts = bufferedReader.readLine().split(";");
                contactslist.add(new Contact(Integer.parseInt(contacts[0]), contacts[1], contacts[2], contacts[3], contacts[4]));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (bufferedReader.readLine() != null );


        return null;
    }

    @Override
    public void add(Contact contact) {

    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
