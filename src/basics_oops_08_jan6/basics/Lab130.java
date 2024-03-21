package src.basics_oops_08_jan6.basics;

public class Lab130 {
    public static void main(String[] args) {

        String name = "Pramod"; // String constant Pool
        String name2 = new String("Pramod"); // Heap area

        name = "Dutta";
        System.out.println(name);

        String str1 = "Hello";
        str1  = str1.concat("Pramod");
        System.out.println(str1);









    }
}
