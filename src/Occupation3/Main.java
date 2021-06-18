/* Main.java
 * This file contains the executable class
 *  for Occupation project - Linked List ,CSCI 211
 * last edited February 16 , 2021 by Sasa Jovanovic
 */

package Occupation3;


import java.io.FileNotFoundException;
import java.util.Scanner;

     // Declaring Main class with executable main method
public class Main {
         // main method
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        // create an instance of the OccupationList class of objects
        OccupationList list = new OccupationList();
        list.loadFile(); //calling method to print occupation

        boolean searchList = true;

        while (searchList) {

            System.out.println("Would you like to search for the occupation? \n yes or no");
            userInput = scnr.nextLine();

            if (userInput.equals("yes")) {

                list.searchCos();

            } // end if()

            else {

                System.out.println("Would you like to print occupation list? \nyes or no");
                userInput = scnr.nextLine();

                if (userInput.equals("yes")) {

                    list.viewList();
                    searchList = false;

                } // end if()

                else {

                    System.out.println("\nGoodbye");
                    searchList = false;

                } //end else()

            } // end else()

        } // end while()
    }
     }

