package src.basics_02;

public class Lab007 {
    public static void main(String[] args) {
        /*
        * Author : Shema
        * Program : Showcase difference b/w printf and println
        * println : prints and then terminates with next line.
        * */
        System.out.print("Shema");
        System.out.println("Mathew");

        int age=10;
        System.out.println("Your age is " + age); //prints a string to System.out

        System.out.printf("Your age is %d " , age); //prints a formatted string to System.out
        // %d - any integer (byte, short , int or long )
        //%s - string
        //%c -char
        //%f -float
    }
}
