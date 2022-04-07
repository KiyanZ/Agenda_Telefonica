import java.io.FileNotFoundException;
import java.util.List;

public interface IContactsProvider {
    List<Contact> loadContacts() throws FileNotFoundException;
    void add(Contact contact);
    void remove(Contact contact);
    void update(Contact contact);
}
