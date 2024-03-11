package src.basics_02;

public class Lab008 {
    public static void main(String[] args) {
        int age =54;
        System.out.printf("%d*1 = %d*2 " , age,2); //for printf, pass the arguments
        // This is used for formatting purpose.

        System.out.println(); //for next line

        //Concatenation with println
        String s1 = "Shema";
        System.out.println("My name is " + s1 + " Mathew");

        System.out.println();

        //Formatting(printf)----use %d, %s , %char etc
        System.out.printf("My name is %s Mathew" , s1); //%s is replaced with the value of s1

        System.out.println();

        float pi=3.14159f;
        System.out.printf("Your value is %f" , pi);
    }
}
