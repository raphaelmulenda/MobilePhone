package Raphael.Mulenda;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactNumber {
    private ArrayList<String> contactNumber = new ArrayList<String>();
    private Scanner scanner = new Scanner(System.in);

    public void addContactNumber(int numIndex, String phoneNumber){
       if (numIndex >= 0){
           contactNumber.add(numIndex,phoneNumber);
           System.out.println("Contact number " + phoneNumber + " saved!");
       }
        else{
            System.out.println("Contact number exist in directory");}

    }

    public void modifyContactNumber(int numberIndex, String phoneNumber){
        if( numberIndex >=0 ){
            String oldNum = contactNumber.get(numberIndex);
            contactNumber.set(numberIndex, phoneNumber);
            System.out.println(oldNum + " has been replaced by " + contactNumber.get(numberIndex));
        }
        else {
            System.out.println("Contact Number does not exist");
        }
    }

    public void removeContactNumber(int numberIndex){
        if (numberIndex >= 0){
            String num = contactNumber.get(numberIndex);
            contactNumber.remove(numberIndex);
            System.out.println("Phone number " + num + " deleted!");
        }
        else {
            System.out.println("Contact does not exist!");
        }

    }
    public String searchPhoneNumber(int numIndex){
        if (numIndex >= 0){
            return ("Phone Number: " + contactNumber.get(numIndex));
        }
        else return ("Phone Number not found!");
    }

    public ArrayList<String> getContactNumber() {
        return contactNumber;
    }
}
