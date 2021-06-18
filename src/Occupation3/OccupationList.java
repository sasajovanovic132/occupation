/* OccupationList.java
 * This file contains the declaration for the OccupationList( Linked List ) and ListNode classes
 * for Occupation project - Linked Lists CSCI 211
 * last edited February 16, 2021 by Sasa Jovanovic
 */

package Occupation3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


 class ListNode{
     // properties
     Occupation3 data; //
     ListNode linkNext;

        // Constructor method to create empty node with null property values
        public ListNode(){
            data = null;
            linkNext = null;
        }
        // Constructor method to create node with data value  null link value
        public ListNode(Occupation3 occupation){
            this.data = occupation;
            this.linkNext = null;

        }
        // Constructor method to create node with data value  and link value
        public ListNode(Occupation3 occupation, ListNode next){
            this.data = occupation;
            this.linkNext = next;
        }
        // returns a reference to node’s data object
        public Occupation3 getData() {
            return this.data;
     }
        // sets a node’s data object
        public void setData(Occupation3 occupation){
            this.data = occupation;
        }
        // returns a node’s link to the next node
        public ListNode getNextLink(){
         return this.linkNext;
        }
        // sets a node’s link to the next node
        public void setNextLink(ListNode nextLink){
            this.linkNext = nextLink;
        }

 } // end class ListNode


        class OccupationList{
        // head property to hold first node in the list
        ListNode head;
        // properties used for list iteration
        ListNode currentNode;
        ListNode tempNode;

        // constructor to create empty list
        public OccupationList(){};

        // method to load text data from a file
        public void loadFile() throws FileNotFoundException {

            java.io.File file = new java.io.File("occupations.txt");
            Scanner scnr = new Scanner(file);

            Occupation3 inputData;
            String inCOS;
            String inTitle;
            int inEmployment;
            int inSalary;

            while (scnr.hasNextLine()) {

                inCOS = scnr.nextLine();
                inTitle = scnr.nextLine();
                inEmployment = Integer.parseInt(scnr.nextLine());
                inSalary = Integer.parseInt(scnr.nextLine());
                inputData = new Occupation3(inCOS, inTitle, inEmployment, inSalary);
                //  If no head node exists, set input as head node
                if (this.head == null) {this.head = new ListNode(inputData);}

                //  Declare current node and temp node variables
                currentNode = this.head;
                tempNode = new ListNode(inputData);

                //  Iterates through to end of list, then set the next node to the inputted occupation
                while (currentNode.getNextLink() != null) {
                    currentNode = currentNode.getNextLink();
                }   //  End while
                currentNode.setNextLink(tempNode);

            } // end while()

            scnr.close();

        } // end loadFile()


            // search method for COS
            public void searchCos() {
                String input;
                boolean found = false;
                Scanner kb = new Scanner(System.in);

                // Ask for user input
                System.out.println("\n Enter COS:\n");
                input = kb.nextLine();

                // reference to the first node
                currentNode = this.head;

                //  Iterate through entire list
                while (currentNode.getNextLink() != null && !found)
                {
                    if (currentNode.getData().getCos().equals(input))
                    {
                        found = true;
                        System.out.println(currentNode.getData());
                    }   //  End if
                    currentNode = currentNode.getNextLink();
                }   //  End while

                //  If no COS is found ask user for a new input and repeat search
                if (!found)
                {
                    System.out.println("\n Invalid COS, please enter another COS.");
                    searchCos();
                }   //  End if

            } // end searchCos

            //  Method to print the list
            public void viewList()
            {
                //  Iterates through list while the next node has value
                currentNode = head;
                while (currentNode.getNextLink() != null)
                {
                    System.out.println(currentNode.getData());
                    currentNode = currentNode.getNextLink();
                }   //  end while
            }   // end viewList()

 } // end class OccupationList






