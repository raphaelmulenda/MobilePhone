package Raphael.Mulenda;

import java.util.ArrayList;

public class ContactName {
    private ArrayList<String> contactName = new ArrayList<String>();

    public int findContactName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return contactName.indexOf(name);
    }

    public void addContactName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        int nameIndex = findContactName(name);
        if (nameIndex < 0) {
            contactName.add(name);
            System.out.println("Contact Name " + name + " Saved!");
        } else {
            System.out.println("Contact name: " + name + " exist in directory ");
        }
    }

    public void modifyContactName(String oldName, String newName) {
        oldName = oldName.substring(0,1).toUpperCase() + oldName.substring(1).toLowerCase();
        int nameIndex = findContactName(oldName);
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();
        if (nameIndex >= 0) {
            contactName.set(nameIndex, newName);
            System.out.println(oldName + " has been successfully modified by " + newName);
        }
        else {
            System.out.println(oldName + " does not exist in directory");
        }
    }

    public void removeContactName(String name){
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        int nameIndex = findContactName(name);
        if (nameIndex >= 0){
            contactName.remove(nameIndex);
            System.out.println(name + " has been removed from directory");
        }
        else {
            System.out.println(name + " does not exist in directory");
        }
    }
    public void printContactName(){
        System.out.println("List of contacts: ");
        for (int i =0; i < contactName.size(); i++){
            System.out.println((i+1)+ ". " + contactName.get(i));
        }
    }

    public ArrayList<String> getContactName() {
        return contactName;
    }
    public String searchContactName(String name){
        int contactIndex = findContactName(name);
        if (contactIndex >=0){
            return ("Contact Name: " + contactName.get(contactIndex));
        }
        else return ("Contact Name not found");
    }
}
