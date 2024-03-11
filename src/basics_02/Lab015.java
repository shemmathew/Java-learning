package src.basics_02;

public class Lab015 {
    public static void main(String[] args) {
        char c1='\n'; //next line
        char c2='\t'; //add tab
        char c3='\b'; //delete one character or back slash
        char c4='\r'; // carriage return-deletes starting and returns the right from 'r'
        char c5='\''; //adds single quote

        System.out.println("Shema" + c2 + "Mathew");
        System.out.println("Shema" + c3 + "Mathew");
        System.out.println("Shema" + c4 + "Mathew");
        System.out.println("Shema" + c5 + "Mathew");


        System.out.println("Shema\nMathew");
        System.out.println("Shema\tMathew");
        System.out.println("Shema\bMathew");
        System.out.println("Shem\raMathew");
        System.out.println("Shema\'Mathew");
    }
}
