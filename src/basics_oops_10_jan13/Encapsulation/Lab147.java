package src.basics_oops_10_jan13.Encapsulation;

public class Lab147 {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.name = "Amit";
        s1.name = " Pramod";

        // Getter and setter - Condition Based
        // They should be hidden


        PersonS personS = new PersonS();
        personS.id = 1;
        personS.id = 99;
        personS.id = -1;
        personS.bal = 999;

    }
}
