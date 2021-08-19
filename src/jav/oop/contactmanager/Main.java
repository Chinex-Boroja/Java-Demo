package jav.oop.contactmanager;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        //Create a new Contact object for Uchechukwu
        Contact info0 = new Contact();
        //set the contact's bio data / fields
        info0.name = "Uchechukwu Nwafor";
        info0.phoneNumber = "0823456784";
        //adding the contact to ContactManager
        myContactManager.addContact(info0);

        //Create a new Contact Object
        Contact info1 = new Contact();
        //set the fields
        info1.name = "Onikoyi Olutoba";
        info1.phoneNumber = "058666445";
        //adding the Contact to the ContactManager
        myContactManager.addContact(info1);

        //Create a new Contact Object
        Contact info2 = new Contact();
        info2.name = "Israel Odejobi";
        info2.phoneNumber = "0998776553";

        myContactManager.addContact(info2);

        //Create a new Contact Object
        Contact info3 = new Contact();
        info3.name = "Toba Edward";
        info3.phoneNumber = "05865245";

        myContactManager.addContact(info3);

        //Create a new Contact Object
        Contact info4 = new Contact();
        info4.name = "Israel Benjamin";
        info4.phoneNumber = "09986634";

        myContactManager.addContact(info4);

        Contact result = myContactManager.searchContact("Israel Benjamin");
        System.out.println(result.phoneNumber);
    }
}
