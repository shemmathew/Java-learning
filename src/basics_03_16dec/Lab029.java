package src.basics_03_16dec;

public class Lab029 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        // This string is created in String Constant Pool - SCP / String Pool

        // new Operator - to create Object
        String s2 = new String("Pramod");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Pramod"));
    }

}
