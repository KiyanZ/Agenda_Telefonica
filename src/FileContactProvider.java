
import java.io.*;
import java.util.List;


public class FileContactProvider implements IContactsProvider{
    @Override
    public List<Contact> loadContacts() throws FileNotFoundException {

        FileReader fileReader = new FileReader("/home/INFORMATICA/alu10467008/Escriptori/agenda/resources/contacts.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        bufferedReader.readLine()
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
