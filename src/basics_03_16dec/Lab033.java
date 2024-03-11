package src.basics_03_16dec;

public class Lab033 {
    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        //name and name1 strings-only 1 will be created as both are same (memory management)
        //name2 is diffrent--object is created
        String name2 = new String("The Testing academy"); // Heap area

       System.out.println(name == name1);
        System.out.println(name.equals(name1)); // true


        System.out.println(name == name2); //false

        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));


    }
}
