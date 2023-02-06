package Day10;

import Day9.AddressBook;

public class AddressBookMain {
    public static void main(String[] args) {
    Day9.AddressBook addressBook = new AddressBook();
    addressBook.addContact();
    addressBook.editContact();
    addressBook.deleteContact();
    addressBook.checkDuplicateContact();
    addressBook.searchByCityOrState();
    addressBook.NoOfContactPersons();
}
}
