package Raphael.Mulenda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static ContactName contactName = new ContactName();
private static ContactNumber contactNumber = new ContactNumber();
    public static void main(String[] args) {
       /* ContactName contactName = new ContactName();
        ContactNumber contactNumber = new ContactNumber();
        contactName.addContactName("Marcel");
        contactName.addContactName("Anna");
        contactName.addContactName("Raphael");
        contactName.addContactName("Justyna");
        contactName.printContactName();
        //contactNumber.addContactNumber(contactName.findContactName("Marcel"));
        //contactName.removeContactName("Marcel");
        System.out.println("search contact " + contactName.getContactName().get(2));
        System.out.println("contact found " + contactName.searchContactName("Raphae"));*/

        boolean phoneOn = true;
        int pressedButton = 0;
        showPhoneMenu();
        while (phoneOn){
            System.out.println("Enter a number: ");
            pressedButton = scanner.nextInt();
            scanner.nextLine();
            switch (pressedButton){
                case 0:
                    showPhoneMenu();
                    break;
                case 1:
                    searchContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    System.out.println("GoodBye!");
                    phoneOn=false;
                    break;


            }
        }

    }

    public static void showPhoneMenu(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To show directory options.");
        System.out.println("\t 1 - To Search a contact.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To modify contact.");
        System.out.println("\t 4 - To remove contact.");
        System.out.println("\t 5 - To quit.");
    }
    public static void searchContact(){
        System.out.println("Enter contact name to search: ");
        String name = scanner.nextLine();
        int numIndex = contactName.findContactName(name);
        contactName.searchContactName(name);
        contactNumber.searchPhoneNumber(numIndex);
        System.out.println(contactName.searchContactName(name) + " : " + contactNumber.searchPhoneNumber(numIndex));
    }

    public static void addContact(){
        System.out.println("Enter contact Name: ");
        String name = scanner.nextLine();
        contactName.addContactName(name);
        int nameIndex = contactName.findContactName(name);
        System.out.println("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();
        contactNumber.addContactNumber(nameIndex,phoneNumber);
    }
    public static void modifyContact(){
        System.out.println("Enter the old name: ");
        String oldName = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        contactName.modifyContactName(oldName,newName);
        int newNameIndex = contactName.findContactName(newName);
        System.out.println("Enter new phone number");
        String newPhoneNumber = scanner.nextLine();
        contactNumber.modifyContactNumber(newNameIndex,newPhoneNumber);


    }
    public static void removeContact(){
        System.out.println("Enter contact name to delete: ");
        String name = scanner.nextLine();
        int numIndex = contactName.findContactName(name);
        contactName.removeContactName(name);
        contactNumber.removeContactNumber(numIndex);
    }
}
