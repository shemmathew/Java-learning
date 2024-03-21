package src.basics_oops_09_jan7.Inheritance;

public class ATBPerson {
    String name; // instance  variable values are assigned by default
    long phone;  //default values are not initialized
    String email;
    boolean isMarried;
    String courseName;

    // Default Constructor
    ATBPerson(){
        courseName = "ATB course"; //usually default constructor contains common values which are common to every objects
        System.out.println("I am Default!");
    }

    // Parametrized Constructor
    ATBPerson(String valuefromObjectRef){
        this.name = valuefromObjectRef;
    }

    void talk(){
        System.out.println(" Talk!!");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(courseName);
    }
}
