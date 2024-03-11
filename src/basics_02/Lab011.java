package src.basics_02;

import java.sql.SQLOutput;

public class Lab011 {
    public static void main(String[] args) {
        char c1='$';
        char c2='/';
        char c3='\n';

        System.out.println( c1);
        System.out.println( c2);
        System.out.println( c3);

        char c4='\u0062';  //CAN USE CHAR
        String c5= "U+2714";  //this may be supported in JAVA 21-use String if U+

        System.out.println(c4);
        System.out.println(c5);

        int age=10; //Decimal system
        int b= 0101; //Octal system -start with 0
        int b2= 0b101; //Binary - start with 0b
        int c45=0Xface; //hexadecimal

    }
}
