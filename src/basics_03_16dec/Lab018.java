package src.basics_03_16dec;

public class Lab018 {
    public static void main(String[] args) {
        int a=10;
        int b=45;

        System.out.println(a+b);

        String name="Shema";

        System.out.println(a+name); //Interview
        System.out.println(name+a);  //Interview

        //concatenation = String + other--copy , if other way do simple addition
        System.out.println(a+b+name); // result is 55Shema
        System.out.println(name+a+b); // result is Shema1045
        System.out.println(a+name+b); // result is 10Shema45

    }
}
