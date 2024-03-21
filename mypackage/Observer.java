package mypackage;

import java.util.ArrayList;

public class Observer {
    public static void main(String[] args) {
        ContactsManager manager = new ContactsManager();

        WhatsApp whatsApp = new WhatsApp();
        Instagram instagram = new Instagram();

        manager.subscribers.add(whatsApp);
        manager.subscribers.add(instagram);

        manager.addContact(new Contact("Arfeen", "123"));
    }
}

class ContactsManager {
    ArrayList<Contact> contacts = new ArrayList<>();
    ArrayList<Subscriber> subscribers = new ArrayList<>();

    boolean addContact(Contact c) {
        contacts.add(c);
        for (Subscriber s : subscribers)
            s.notifyContactsUpdated(contacts);

        return true;
    }
}

interface Subscriber {
    void notifyContactsUpdated(ArrayList<Contact> newContacts);
}

class WhatsApp implements Subscriber {

    @Override
    public void notifyContactsUpdated(ArrayList<Contact> newContacts) {
    }
}

class Instagram implements Subscriber {

    @Override
    public void notifyContactsUpdated(ArrayList<Contact> newContacts) {
    }
}