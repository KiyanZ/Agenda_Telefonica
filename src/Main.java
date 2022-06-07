import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Contact contact = new Contact("Pepe", "123456789", "C/Bonita", "pepe@gmail.com");
//        System.out.println(contact);

        Agenda agenda = new Agenda(new FileContactProvider());
        System.out.println(agenda);

        Contact contact = agenda.retrieve(0);
        contact.setName("Juan Antonio");
        agenda.update(contact);

        System.out.println(agenda);

        FileReader fileReader = new FileReader("/home/INFORMATICA/alu10467008/Escriptori/agenda/resources/contacts.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] contacts;
        contacts = bufferedReader.readLine().split(";");
        SerializableContactsProvider.toJson(contacts);
    }

}
