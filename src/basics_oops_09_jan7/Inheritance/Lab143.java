package src.basics_oops_09_jan7.Inheritance;

public class Lab143 {
    public static void main(String[] args) {

        // this
        // constructor
        // inheritance
        // ecap
        // abstrc
        // super()

        ATBPerson p = new ATBPerson(); // Default constructor
        p.name = "Amit";
        p.printDetails(); //if name was not set up (p.name=Amit) and go for p.printDetails(), THEN DEFAULT VALUES WOULD APPEAR.
// default values:string-null, int-0 , long - 0 , boolean -  false
// This is for instance variables only
        // here p is set through default constructor--name is set, course name is set through default constructor




        ATBPerson p3 = new ATBPerson("Shema"); // Parametrized constructor
//        p3.name = "Pramod";--instead of giving separate values, we can use parametrized constructor
        p3.printDetails();
//here name is only set, coursename is giving me null because p3 is set through parametrized constructor




//        String s; // Local Variable default value is never assigned by JVM
//        System.out.println(s);---will give error if prints.Instance variables are assigned only through obj reference



        // Constructor
        // Constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

        // - Default Constructor 18-19%
        //- Parametrized Constructor - 70%
        // Copy Constructor in Java - <%1







    }
}
