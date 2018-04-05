package com.example.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        boolean stopLoop = false;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> myPeople = new ArrayList<>();
        Person coolPeople;
        String answer = " ";

        do {


                coolPeople = new Person();

                System.out.print("What is your first name ? ");
                coolPeople.setFirstName(keyboard.nextLine());


                System.out.print("What is your last name ? ");
                coolPeople.setLastName(keyboard.nextLine());

                System.out.print("What is your address ? ");
                coolPeople.setAddress(keyboard.nextLine());

                System.out.print("What is your phone number ? ");
                coolPeople.setPhoneNumber(keyboard.nextLine());

                System.out.print("What is your email address ? ");
                coolPeople.setEmail(keyboard.nextLine());

                myPeople.add(coolPeople);

                System.out.print("Do you want to continue ?   (Y/N)");
                answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No")){

                stopLoop = true;


            }


        }while(!stopLoop);


        for (Person eachPerson: myPeople){
            System.out.println(eachPerson.getFirstName());
            System.out.println(eachPerson.getLastName());
            System.out.println(eachPerson.getAddress());
            System.out.println(eachPerson.getPhoneNumber());
            System.out.println(eachPerson.getEmail());
            System.out.println("========================");
        }

    }
}
    /*Create an application that accepts the details of 5 people.

        Print out their names in an array list.



        First:

        Create 5 people: person1 ,person2, person3, person4, person5.

        Each person should have entries for:

        - first name

        - last name

        - address

        - phone number

        - e-mail

        Add these persons to an array list.



        Display a list of  first names only.*/

    /*1. Write an address book. You should be able to:
            -  Add people to the address book - require the user to enter details of a contact. After each contact, you will ask whether the user wants to enter another contact.
            -  Display a list of contacts in your address book - when the user selects 'n' or 'no' when asked if they want to enter another contact, display the entire list of contacts added.*/













