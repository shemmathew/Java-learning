package src.basics_03_16dec;

public class Lab021 {
    public static void main(String[] args) {

        //Relational operator

        System.out.println(10==10); //Prints true
        System.out.println(10<=10); //Prints true
        System.out.println(10>=10); //Prints true
        System.out.println(10<10);  //Prints false
        System.out.println(10>10);  //Prints false

        System.out.println("------------------"); //matter in double quotes always print like that


        System.out.println('A'==65); //A character in the SOP statement is always considered as an Integer
                                     //Here 65 is the ASCII value of A
       // System.out.println('A'=65); Assigning value is not Possible with SOP

        byte b= 65;
        System.out.println('A'==b); //not assigning, comparison is happening here with == in SOP.If the value of b was 56,
                                    // it would print false

        System.out.println('A'==65.0);  //property of java- //Prints true
        System.out.println('A'==65.0F); //Prints true
        System.out.println('A'==65.2F); //Prints false
        System.out.println('A'==65.000000); //Prints true

       //  System.out.println(true == 0); ==cannot be applied to boolean and int
        //  System.out.println(true <= true); Boolean cannot have comparison operator
    }
}
