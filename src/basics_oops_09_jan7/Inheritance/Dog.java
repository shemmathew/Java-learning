package src.basics_oops_09_jan7.Inheritance;

public class Dog {

    String name; // Instance Variable--available in the method

    Dog(){
        System.out.println("DC");
    }

    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("PC");
    }

    void bark(){
        int age = 10; // Local Variable--unavailable outside the method
        System.out.println("Bark");
        System.out.println("Dog name is -> "+ this.name); ///instance variable name is available outside
    } //scanner class is only used inside main method
}
