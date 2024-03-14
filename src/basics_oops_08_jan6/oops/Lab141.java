package src.basics_oops_08_jan6.oops;

public class Lab141 {
    public static void main(String[] args) {



        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Person p = new Person(); //OBJECT 1
        p.name = "Amit";
        System.out.println(p.name);

        Person p2 = new Person(); //OBJECT 2
        p2.name = "Pramod";
        System.out.println(p2.name);


        new Person(); // object -> new Object //OBJECT 3
        // Person(); -> Method or Function
        Person p3 = null; //NO OBJECT CREATION
        System.out.println("End of the Program");


        // p,p2 and p3 - Ref -
        // p -> Amit , p2 -> Pramod, p3 -> null






    }
}
