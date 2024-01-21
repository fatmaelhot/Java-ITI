package packet.addressbook.util;

import packet.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
  public static List<Contact> getContacts(){
    List<Contact> contacts = new ArrayList<>();
    contacts.add(new Contact("1", "fatma", "nasser", "01234567"));
    contacts.add(new Contact("2", "ahmed", "mohammed", "01234567"));
    contacts.add(new Contact("3", "mahmoud", "mohammed", "01234567"));

    return contacts;
  }
}
