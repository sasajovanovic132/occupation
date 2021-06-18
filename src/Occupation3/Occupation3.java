/* Occupation3.java
 * this class contains mutator and accessors methods for Occupation3 class
 * for Occupation projects CSCI 211
 * last edited January 24, 2021 by Sasa Jovanovic
 */

package Occupation3;

    //Declaring class OccupationList
public class Occupation3 {
    // properties of the class Occupation3
    private String cos; // The 6-digit Standard Occupational Classification (SOC) code for each occupation
    private String title; // Title of the occupation
    private int employment; // The number of people in the US employed in this occupation
    private int salary; // The average salary for all people employed in the US in this occupation



        // constructor methods
    Occupation3() {
    } // end Occupation3()

    Occupation3(String inCos, String inTitle, int inEmployment, int inSalary) {

        cos = inCos;
        title = inTitle;
        employment = inEmployment;
        salary = inSalary;

    } // end Occupation3()

    // Mutator methods

    public void setCos(String inCos) {

        this.cos = inCos;

    } // end setCos()

    public void setTitle(String inTitle) {

        this.title = inTitle;

    } // end setTitle()

    public void setEmployment(int inEmployment) {

        this.employment = inEmployment;

    } // end setEmployment()

    public void setSalary(int inSalary) {

        this.salary = inSalary;

    } // end setSalary()

    // Accessor methods

    public String getCos() {

        return this.cos;

    } //end getCos()

    public String getTitle() {

        return this.title;

    } // end getTitle()

    public int getEmployment() {

        return this.employment;

    } // end getEmployment()

    public int getSalary() {

        return this.salary;

    } // end getSalary()

    public String toString() {

        String data = "COS: " + cos + "\n" + "Title: " + title + "\n" + "Employment: " + employment + "\n" + "Salary: " + this.salary + "\n";
        return data;

    } // end toString()

} // end class Occupation
