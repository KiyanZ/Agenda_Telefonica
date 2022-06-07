import java.io.*;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;


public class SerializableContactsProvider implements IContactsProvider, Serializable {
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
        } while (bufferedReader.readLine() != null);
        return null;
    }

    public static void toJson(String[] contacts) {
        Gson gson = new Gson();
        String represntacionJson = gson.toJson(contacts);
        System.out.println(represntacionJson);
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


