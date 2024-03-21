package mypackage;

public class Adapter {
    
}

class ContactsLibrary{
    public static boolean saveContact(String name, String [] phoneNumbers){
        return true;
    }
}

class CreateContactScreen{
    Contact contact;

    public CreateContactScreen(Contact contact){
        this.contact = contact;
    }

    public boolean saveContact(){
        ContactAdapter adapter = new ContactAdapter(contact);
        return adapter.saveContact();
    }
}

class ContactAdapter{
    Contact contact;

    public ContactAdapter(Contact contact){
        this.contact = contact;
    }

    public boolean saveContact(){
       String [] phoneNos = contact.phoneNos.split(",");
       return ContactsLibrary.saveContact(contact.name, phoneNos);
    }
}